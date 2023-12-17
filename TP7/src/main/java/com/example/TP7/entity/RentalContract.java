package com.example.TP7.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="RentalContract")

public class RentalContract{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "property_id") // Nom de la colonne faisant référence à la clé primaire de la table Property
    private Property property;
    @ManyToOne
    @JoinColumn(name = "owner_id") // Nom de la colonne faisant référence à la clé primaire de la table Owner
    private Owner owner;
    @Column(name = "tenant")
    private String tenant;
    @Column(name = "monthlyRent")
    private double monthlyRent;

    public RentalContract(){

    }
    public RentalContract(long id, Property property, Owner owner, String tenant, double monthlyRent) {
        this.id = id;
        this.property = property;
        this.owner = owner;
        this.tenant = tenant;
        this.monthlyRent = monthlyRent;
    }
}