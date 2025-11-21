package com.libramanager.dto.request;

import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderRequestDTO {
    private Long supplierId;
    private Long targetWarehouseId;
    private Long storeId;

    private List<PurchaseItemRequestDTO> items;
}