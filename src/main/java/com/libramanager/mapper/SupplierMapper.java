package com.libramanager.mapper;

import com.libramanager.dto.request.SupplierRequestDTO;
import com.libramanager.dto.response.SupplierResponseDTO;
import com.libramanager.model.entity.Supplier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    @Mapping(target = "id", ignore = true)
    Supplier toEntity(SupplierRequestDTO dto);

    SupplierResponseDTO toResponse(Supplier entity);
}