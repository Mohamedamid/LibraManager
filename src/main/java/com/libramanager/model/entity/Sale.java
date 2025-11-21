package com.libramanager.model.entity;

import com.libramanager.model.enums.*;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sales")
public class Sale {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceNumber; // Numéro unique (ex: INV-2025-0001)
    private LocalDateTime saleDate = LocalDateTime.now();

    private BigDecimal totalAmount; // Montant total à payer
    private BigDecimal paidAmount;  // Montant réellement payé (pour gérer les avances)

    @Enumerated(EnumType.STRING)
    private SaleType type;          // RETAIL ou WHOLESALE

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;   // PAID, PENDING, PARTIAL

    @ManyToOne
    private Client client; // Peut être NULL si c'est une vente au détail (client anonyme)

    @ManyToOne
    private User user;     // Le caissier qui a fait la vente

    private Long storeId;

    // OneToMany : Une vente contient plusieurs lignes (SaleItem)
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<SaleItem> items;
}