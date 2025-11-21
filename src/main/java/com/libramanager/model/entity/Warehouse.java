package com.libramanager.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "warehouses")
public class Warehouse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;      // Ex: "Magasin Principal", "Dépôt Garage"
    private String location;  // Adresse physique

    // Si true : On peut vendre directement de cet endroit (ex: Magasin)
    // Si false : C'est juste du stockage (ex: Garage), il faut faire un transfert avant
    private boolean isSellable;

    private Long storeId;
}