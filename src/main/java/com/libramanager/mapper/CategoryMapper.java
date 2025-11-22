package com.libramanager.mapper;

import com.libramanager.dto.request.CategoryRequestDTO;
import com.libramanager.dto.response.CategoryResponseDTO;
import com.libramanager.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(target = "id", ignore = true)
    Category toEntity(CategoryRequestDTO dto);

    CategoryResponseDTO toResponse(Category entity);
}