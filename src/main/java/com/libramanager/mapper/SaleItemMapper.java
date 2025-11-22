package com.libramanager.mapper;

import com.libramanager.dto.request.SaleItemRequestDTO;
import com.libramanager.dto.response.SaleItemResponseDTO;
import com.libramanager.model.entity.SaleItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SaleItemMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "product.id", source = "productId")
    @Mapping(target = "unitPrice", ignore = true)
    @Mapping(target = "subTotal", ignore = true)
    @Mapping(target = "sale", ignore = true)
    SaleItem toEntity(SaleItemRequestDTO dto);

    @Mapping(target = "productName", source = "product.name")
    SaleItemResponseDTO toResponse(SaleItem entity);
}