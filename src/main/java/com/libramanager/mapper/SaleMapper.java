package com.libramanager.mapper;

import com.libramanager.dto.request.SaleRequestDTO;
import com.libramanager.dto.response.SaleResponseDTO;
import com.libramanager.model.entity.Sale;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {SaleItemMapper.class})
public interface SaleMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "invoiceNumber", ignore = true)
    @Mapping(target = "saleDate", ignore = true)
    @Mapping(target = "totalAmount", ignore = true)
    @Mapping(target = "client.id", source = "clientId")
    @Mapping(target = "user.id", source = "userId")
    Sale toEntity(SaleRequestDTO dto);

    @Mapping(target = "clientName", source = "client.fullName")
    @Mapping(target = "userName", source = "user.username")
    @Mapping(target = "remainingAmount", expression = "java(entity.getTotalAmount().subtract(entity.getPaidAmount()))")
    SaleResponseDTO toResponse(Sale entity);
}