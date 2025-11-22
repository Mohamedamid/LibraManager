package com.libramanager.mapper;

import com.libramanager.dto.request.BarcodeDTO;
import com.libramanager.dto.response.BarcodeResponseDTO;
import com.libramanager.model.entity.ProductBarcode;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BarcodeMapper {

    // Request -> Entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "product", ignore = true)
    ProductBarcode toEntity(BarcodeDTO dto);

    // Entity -> Response
    BarcodeResponseDTO toResponse(ProductBarcode entity);
}