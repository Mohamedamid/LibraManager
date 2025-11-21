package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_barcodes")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductBarcode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String barcode;

    // Facteur de conversion pour le stock.
    // Ex: 1 = Pièce, 50 = Boite
    private Integer multiplier;

    private String label; // "Unit", "Box", etc.

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}