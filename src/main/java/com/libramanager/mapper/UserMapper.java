package com.libramanager.mapper;

import com.libramanager.dto.request.UserRequestDTO;
import com.libramanager.dto.response.UserResponseDTO;
import com.libramanager.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(UserRequestDTO dto);

    UserResponseDTO toResponse(User entity);
}