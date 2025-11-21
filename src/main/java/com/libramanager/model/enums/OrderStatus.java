package com.libramanager.model.enums;

public enum OrderStatus {

    /**
     * EN ATTENTE : La commande a été créée et envoyée au fournisseur,
     * mais la marchandise n'est pas encore arrivée.
     * -> IMPACT STOCK : Aucun changement (0).
     */
    PENDING,

    /**
     * REÇUE : La marchandise est arrivée, a été comptée et validée.
     * -> IMPACT STOCK : Le stock a été AUGMENTÉ selon la quantité reçue.
     */
    RECEIVED,

    /**
     * PARTIELLEMENT REÇUE : Le fournisseur n'a livré qu'une partie de la commande
     * (ex: Commandé 100, Reçu 50). La commande reste ouverte en attendant le reste.
     * -> IMPACT STOCK : Augmentation partielle.
     */
    PARTIALLY_RECEIVED,

    /**
     * ANNULÉE : La commande a été annulée par le gérant avant la réception.
     * -> IMPACT STOCK : Aucun changement.
     */
    CANCELLED,

    /**
     * REJETÉE : La marchandise est arrivée mais a été refusée (endommagée ou non conforme).
     * Elle est retournée au fournisseur.
     * -> IMPACT STOCK : Aucun changement.
     */
    REJECTED
}