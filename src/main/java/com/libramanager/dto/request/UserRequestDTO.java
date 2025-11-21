package com.libramanager.dto.request;

import com.libramanager.model.enums.Role;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {
    private String username;
    private String password;
    private String fullName;
    private Role role;
    private Long storeId;

    @Builder.Default
    private boolean enabled = true;
}