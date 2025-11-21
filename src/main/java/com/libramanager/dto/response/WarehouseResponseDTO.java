package com.libramanager.dto.response;

import lombok.*;

@Data
@Builder
public class WarehouseResponseDTO {
    private Long id;
    private String name;
    private String location;
    private boolean isSellable;
}