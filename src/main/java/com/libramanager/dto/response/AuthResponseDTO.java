package com.libramanager.dto.response;

import lombok.*;

@Data
@Builder
public class AuthResponseDTO {
    private String accessToken;
    private String username;
    private String role;
    private Long storeId;
}