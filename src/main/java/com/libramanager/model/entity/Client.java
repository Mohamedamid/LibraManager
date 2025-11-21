package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String phone;
    private String address; // Important pour la facturation

    // Le total des dettes (Crédit) que le client doit payer
    @Builder.Default
    private BigDecimal balance = BigDecimal.ZERO;

    private Long storeId;
}