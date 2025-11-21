package com.libramanager.dto.response;

import lombok.*;

@Data
@Builder
public class StockLevelResponseDTO {
    private String productName;
    private String warehouseName;
    private Integer quantity;
}