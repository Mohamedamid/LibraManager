package com.libramanager.model.entity;

import com.libramanager.model.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "purchase_orders")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Référence unique de la commande (ex: PO-2025-001)
    private String orderNumber;

    // Date de création de la commande (quand on a appelé le fournisseur)
    private LocalDateTime orderDate = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private OrderStatus status = OrderStatus.PENDING; // Par défaut, elle est en attente

    @ManyToOne
    private Supplier supplier;  // Le fournisseur concerné

    // TRÈS IMPORTANT : L'entrepôt cible.
    // C'est ici que le stock sera ajouté une fois la commande validée (ex: Dépôt central).
    @ManyToOne
    private Warehouse targetWarehouse;

    private Long storeId; // SaaS (Isolation des données)

    // Liste des produits commandés (Détails)
    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PurchaseOrderItem> items = new ArrayList<>();
}