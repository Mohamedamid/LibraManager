package com.libramanager.dto.response;

import lombok.*;

@Data
@Builder
public class BarcodeResponseDTO {
    private String barcode;
    private Integer multiplier;
    private String label;
}