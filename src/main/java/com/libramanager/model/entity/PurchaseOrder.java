package com.libramanager.model.entity;

import com.libramanager.model.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "purchase_orders")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;

    @Builder.Default
    private LocalDateTime orderDate = LocalDateTime.now();

    // Statut initial PENDING. Passage à RECEIVED uniquement après vérification physique.
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private OrderStatus status = OrderStatus.PENDING;

    @ManyToOne
    private Supplier supplier;

    // Destination du stock (Généralement le dépôt central)
    @ManyToOne
    private Warehouse targetWarehouse;

    private Long storeId;

    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<PurchaseOrderItem> items = new ArrayList<>();
}