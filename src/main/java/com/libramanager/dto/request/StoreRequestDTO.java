package com.libramanager.dto.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreRequestDTO {
    private String name;
    private String address;
    private String phone;
}