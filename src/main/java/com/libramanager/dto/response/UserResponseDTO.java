package com.libramanager.dto.response;

import com.libramanager.model.enums.Role;
import lombok.*;

@Data
@Builder
public class UserResponseDTO {
    private Long id;
    private String username;
    private String fullName;
    private Role role;
    private boolean enabled;
}