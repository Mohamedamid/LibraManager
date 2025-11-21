package com.libramanager.dto.request;

import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {
    private String name;
    private String description;

    private BigDecimal purchasePrice;
    private BigDecimal retailPrice;
    private BigDecimal wholesalePrice;

    private Integer minStockAlert;

    private Long categoryId;
    private Long storeId;

    private List<BarcodeDTO> barcodes;
}