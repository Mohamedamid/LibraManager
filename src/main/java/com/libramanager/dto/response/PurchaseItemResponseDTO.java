package com.libramanager.dto.response;

import lombok.*;

@Data
@Builder
public class PurchaseItemResponseDTO {
    private String productName;
    private Integer quantityOrdered;
    private Integer quantityReceived;
}