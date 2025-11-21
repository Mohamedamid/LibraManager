package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data // Génère Getters, Setters, toString, etc.
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;        // Nom de la librairie (ex: Librairie Al-Najah)
    private String address;
    private String phone;
    private boolean isActive;   // Pour bloquer une librairie si abonnement non payé

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}