package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    // --- PRIX ---
    private BigDecimal purchasePrice;  // Prix d'achat (Coût)
    private BigDecimal retailPrice;    // Prix de vente détail (Public)
    private BigDecimal wholesalePrice; // Prix de vente gros (Entreprises)

    // NOTE IMPORTANTE : Pas de champ "stockQuantity" ici !
    // Le stock est calculé dynamiquement via la table 'StockLevel' (voir plus bas).

    private Integer minStockAlert;     // Seuil pour l'alerte de rupture

    @ManyToOne
    private Category category;

    private Long storeId; // Isolation des données (SaaS)

    // Relation One-to-Many avec les codes-barres
    // CascadeType.ALL : Si on sauvegarde le produit, on sauvegarde ses codes-barres
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductBarcode> barcodes = new ArrayList<>();
}