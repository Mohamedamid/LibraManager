package com.libramanager.dto.response;

import com.libramanager.model.enums.OrderStatus;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class PurchaseOrderResponseDTO {
    private Long id;
    private String orderNumber;
    private LocalDateTime orderDate;
    private OrderStatus status;

    private String supplierName;
    private String warehouseName;

    private List<PurchaseItemResponseDTO> items;
}