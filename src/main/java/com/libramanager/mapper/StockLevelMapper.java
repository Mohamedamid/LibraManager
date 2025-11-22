package com.libramanager.mapper;

import com.libramanager.dto.response.StockLevelResponseDTO;
import com.libramanager.model.entity.StockLevel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StockLevelMapper {

    // Entity -> Response
    @Mapping(target = "productName", source = "product.name")
    @Mapping(target = "warehouseName", source = "warehouse.name")
    StockLevelResponseDTO toResponse(StockLevel entity);
}