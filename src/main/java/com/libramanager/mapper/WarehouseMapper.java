package com.libramanager.mapper;

import com.libramanager.dto.request.WarehouseRequestDTO;
import com.libramanager.dto.response.WarehouseResponseDTO;
import com.libramanager.model.entity.Warehouse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WarehouseMapper {

    @Mapping(target = "id", ignore = true)
    Warehouse toEntity(WarehouseRequestDTO dto);

    WarehouseResponseDTO toResponse(Warehouse entity);
}