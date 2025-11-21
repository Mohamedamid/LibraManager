package com.libramanager.dto.response;

import lombok.*;

@Data
@Builder
public class SupplierResponseDTO {
    private Long id;
    private String name;
    private String phone;
    private String email;
}