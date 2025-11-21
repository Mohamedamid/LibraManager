package com.libramanager.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierRequestDTO {
    private String name;
    private String phone;
    private String email;
    private Long storeId;
}