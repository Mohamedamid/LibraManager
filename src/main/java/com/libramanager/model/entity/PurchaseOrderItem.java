package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "purchase_order_items")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    // Qté demandée au fournisseur
    private Integer quantityOrdered;

    // Qté réellement reçue (Scan à la réception).
    // C'est cette valeur qui incrémente le StockLevel.
    @Builder.Default
    private Integer quantityReceived = 0;

    @ManyToOne
    @JoinColumn(name = "purchase_order_id")
    private PurchaseOrder purchaseOrder;
}