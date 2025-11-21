package com.libramanager.model.entity;

import com.libramanager.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password; // Hash BCrypt obligatoire
    private String fullName;

    @Enumerated(EnumType.STRING)
    private Role role;

    // Null si SUPER_ADMIN. Sinon, obligatoire pour l'isolation des données.
    private Long storeId;
}