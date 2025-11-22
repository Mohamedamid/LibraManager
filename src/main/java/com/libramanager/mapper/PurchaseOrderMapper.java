package com.libramanager.mapper;

import com.libramanager.dto.request.PurchaseOrderRequestDTO;
import com.libramanager.dto.response.PurchaseOrderResponseDTO;
import com.libramanager.model.entity.PurchaseOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PurchaseOrderItemMapper.class})
public interface PurchaseOrderMapper {

    // Request -> Entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "orderNumber", ignore = true)
    @Mapping(target = "orderDate", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "supplier.id", source = "supplierId")
    @Mapping(target = "targetWarehouse.id", source = "targetWarehouseId")
    PurchaseOrder toEntity(PurchaseOrderRequestDTO dto);

    // Entity -> Response
    @Mapping(target = "supplierName", source = "supplier.name")
    @Mapping(target = "warehouseName", source = "targetWarehouse.name")
    PurchaseOrderResponseDTO toResponse(PurchaseOrder entity);
}