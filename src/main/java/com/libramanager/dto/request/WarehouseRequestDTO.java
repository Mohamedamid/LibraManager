package com.libramanager.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseRequestDTO {
    private String name;
    private String location;
    private boolean isSellable;
    private Long storeId;
}