package com.libramanager.dto.response;

import lombok.*;

@Data
@Builder
public class CategoryResponseDTO {
    private Long id;
    private String name;
    private int productCount;
}