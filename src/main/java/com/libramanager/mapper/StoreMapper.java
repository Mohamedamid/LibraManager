package com.libramanager.mapper;

import com.libramanager.dto.request.StoreRequestDTO;
import com.libramanager.dto.response.StoreResponseDTO;
import com.libramanager.model.entity.Store;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StoreMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "active", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Store toEntity(StoreRequestDTO dto);

    StoreResponseDTO toResponse(Store entity);
}