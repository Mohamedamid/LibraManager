package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    // Gestion des prix (HT/TTC gérés en front)
    private BigDecimal purchasePrice;
    private BigDecimal retailPrice;
    private BigDecimal wholesalePrice;

    // NB: Le stock réel est dans la table 'stock_levels'.
    // Ne pas ajouter de champ quantity ici pour éviter les conflits multi-entrepôts.

    private Integer minStockAlert;

    @ManyToOne
    private Category category;

    private Long storeId;

    // Gestion des unités multiples (Paquet vs Pièce)
    // Cascade ALL pour save le produit et ses codes-barres en une fois
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<ProductBarcode> barcodes = new ArrayList<>();
}