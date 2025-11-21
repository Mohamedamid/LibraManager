package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "sale_items")
public class SaleItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;     // Quantité vendue (en unités de base)
    private BigDecimal unitPrice; // Prix appliqué au moment de la vente (pour archive)
    private BigDecimal subTotal;  // quantity * unitPrice

    @ManyToOne
    private Product product;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;
}