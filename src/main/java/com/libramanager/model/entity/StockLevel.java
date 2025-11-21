package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stock_levels", uniqueConstraints = {
        // Unicité : Un produit ne peut avoir qu'une seule ligne de stock par entrepôt
        @UniqueConstraint(columnNames = {"product_id", "warehouse_id"})
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockLevel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    private Integer quantity = 0;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
}