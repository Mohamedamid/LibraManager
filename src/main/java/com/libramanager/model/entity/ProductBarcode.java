package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_barcodes")
public class ProductBarcode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String barcode; // Le code scanné (ex: 123456)

    // C'est ici que réside la logique "Paquet vs Pièce"
    // 1 = Pièce unitaire
    // 50 = Paquet de 50 stylos
    private Integer multiplier;

    private String label; // Ex: "Pièce", "Boite", "Carton"

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}