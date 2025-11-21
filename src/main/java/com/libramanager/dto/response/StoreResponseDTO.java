package com.libramanager.dto.response;

import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
public class StoreResponseDTO {
    private Long id;
    private String name;
    private String address;
    private boolean isActive;
    private LocalDateTime createdAt;
}