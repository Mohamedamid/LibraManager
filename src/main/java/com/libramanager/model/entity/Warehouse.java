package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "warehouses")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    // flag 'isSellable':
    // true -> Magasin (Vente directe possible)
    // false -> Dépôt (Stockage uniquement, transfert requis)
    private boolean isSellable;

    private Long storeId;
}