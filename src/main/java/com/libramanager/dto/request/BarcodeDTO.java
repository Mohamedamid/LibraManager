package com.libramanager.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BarcodeDTO {
    private String barcode;
    private Integer multiplier;
    private String label;
}