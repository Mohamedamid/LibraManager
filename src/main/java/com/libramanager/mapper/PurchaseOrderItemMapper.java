package com.libramanager.mapper;

import com.libramanager.dto.request.PurchaseItemRequestDTO;
import com.libramanager.dto.response.PurchaseItemResponseDTO;
import com.libramanager.model.entity.PurchaseOrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PurchaseOrderItemMapper {

    // Request -> Entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "product.id", source = "productId")
    @Mapping(target = "quantityReceived", ignore = true)
    @Mapping(target = "purchaseOrder", ignore = true)
    PurchaseOrderItem toEntity(PurchaseItemRequestDTO dto);

    // Entity -> Response
    @Mapping(target = "productName", source = "product.name")
    PurchaseItemResponseDTO toResponse(PurchaseOrderItem entity);
}