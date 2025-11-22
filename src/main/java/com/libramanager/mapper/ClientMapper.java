package com.libramanager.mapper;

import com.libramanager.dto.request.ClientRequestDTO;
import com.libramanager.dto.response.ClientResponseDTO;
import com.libramanager.model.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "balance", ignore = true)
    Client toEntity(ClientRequestDTO dto);

    ClientResponseDTO toResponse(Client entity);
}