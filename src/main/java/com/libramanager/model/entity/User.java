package com.libramanager.model.entity;

import com.libramanager.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password; // Doit être hashé (BCrypt)
    private String fullName;

    @Enumerated(EnumType.STRING)
    private Role role;

    // CRUCIAL : Lien vers la librairie.
    // Si c'est un SUPER_ADMIN, ce champ peut être null.
    private Long storeId;
}