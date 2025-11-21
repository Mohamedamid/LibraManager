package com.libramanager.dto.response;

import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
public class ClientResponseDTO {
    private Long id;
    private String fullName;
    private String phone;
    private String address;
    private BigDecimal balance;
}