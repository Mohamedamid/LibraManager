package com.libramanager.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseItemRequestDTO {
    private Long productId;
    private Integer quantityOrdered;
}