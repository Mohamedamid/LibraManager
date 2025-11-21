package com.libramanager.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleItemRequestDTO {
    private Long productId;
    private Integer quantity;
}