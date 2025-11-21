package com.libramanager.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockAdjustmentDTO {
    private Long productId;
    private Long warehouseId;
    private Integer newQuantity;
    private String reason;
}