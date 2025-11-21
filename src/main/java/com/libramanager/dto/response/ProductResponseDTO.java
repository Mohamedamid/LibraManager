package com.libramanager.dto.response;

import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class ProductResponseDTO {
    private Long id;
    private String name;
    private String description;

    private BigDecimal retailPrice;
    private BigDecimal wholesalePrice;
    private BigDecimal purchasePrice;

    private String categoryName;

    private Integer totalStock;

    private List<BarcodeResponseDTO> barcodes;
}