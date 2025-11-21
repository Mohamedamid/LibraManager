package com.libramanager.model.entity;

import com.libramanager.model.enums.*;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sales")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoiceNumber;

    @Builder.Default
    private LocalDateTime saleDate = LocalDateTime.now();

    private BigDecimal totalAmount;
    private BigDecimal paidAmount; // Gestion des avances/acomptes

    @Enumerated(EnumType.STRING)
    private SaleType type; // Distinction Vente Comptoir / Gros

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @ManyToOne
    private Client client; // Nullable pour les ventes comptoir (clients de passage)

    @ManyToOne
    private User user;

    private Long storeId;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    @Builder.Default
    private List<SaleItem> items = new ArrayList<>();
}