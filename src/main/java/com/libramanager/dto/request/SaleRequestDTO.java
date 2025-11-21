package com.libramanager.dto.request;

import com.libramanager.model.enums.PaymentStatus;
import com.libramanager.model.enums.SaleType;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleRequestDTO {
    private Long clientId;
    private Long userId;
    private Long storeId;

    private SaleType type;
    private PaymentStatus status;

    private BigDecimal paidAmount;

    private List<SaleItemRequestDTO> items;
}