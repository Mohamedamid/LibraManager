package com.libramanager.dto.response;

import com.libramanager.model.enums.PaymentStatus;
import com.libramanager.model.enums.SaleType;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class SaleResponseDTO {
    private Long id;
    private String invoiceNumber;
    private LocalDateTime saleDate;

    private String clientName;
    private String userName;

    private BigDecimal totalAmount;
    private BigDecimal paidAmount;
    private BigDecimal remainingAmount;

    private SaleType type;
    private PaymentStatus status;

    private List<SaleItemResponseDTO> items;
}