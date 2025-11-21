package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stock_levels", uniqueConstraints = {
        // Cette contrainte empêche d'avoir deux lignes pour le même produit dans le même entrepôt
        @UniqueConstraint(columnNames = {"product_id", "warehouse_id"})
})
public class StockLevel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // C'est ICI qu'on stocke la quantité réelle
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
}