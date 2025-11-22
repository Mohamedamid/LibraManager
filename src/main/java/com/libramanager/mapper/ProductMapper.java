package com.libramanager.mapper;

import com.libramanager.dto.request.ProductRequestDTO;
import com.libramanager.dto.response.ProductResponseDTO;
import com.libramanager.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {BarcodeMapper.class})
public interface ProductMapper {

    // Request -> Entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "barcodes", source = "barcodes")
    @Mapping(target = "category.id", source = "categoryId")
    Product toEntity(ProductRequestDTO dto);

    // Entity -> Response
    @Mapping(target = "categoryName", source = "category.name")
    @Mapping(target = "totalStock", ignore = true)
    ProductResponseDTO toResponse(Product entity);
}