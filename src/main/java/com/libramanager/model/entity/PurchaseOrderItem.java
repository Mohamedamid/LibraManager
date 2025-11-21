package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "purchase_order_items")
public class PurchaseOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product; // Le produit commandé

    // --- LE COEUR DU PROCESSUS ---

    // Quantité Commandée : Ce qu'on a demandé au fournisseur (ex: 100 stylos).
    private Integer quantityOrdered;

    // Quantité Reçue : Ce qu'on a réellement compté au déchargement du camion.
    // Au début, c'est 0. On le remplit manuellement à l'arrivée.
    // C'est SEULEMENT cette quantité qui sera ajoutée au StockLevel.
    private Integer quantityReceived = 0;

    @ManyToOne
    @JoinColumn(name = "purchase_order_id")
    private PurchaseOrder purchaseOrder;
}