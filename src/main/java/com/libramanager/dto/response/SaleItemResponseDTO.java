package com.libramanager.dto.response;

import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
public class SaleItemResponseDTO {
    private String productName;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal subTotal;
}