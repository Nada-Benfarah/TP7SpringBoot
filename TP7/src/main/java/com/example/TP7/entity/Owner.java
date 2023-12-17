package com.example.TP7.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")

    private String name;
    @Column(name = "contactInformation")
    private String contactInformation;

    public Owner(){

    }
    public Owner(long id,String name,String contactInformation){
        this.id=id;
        this.name=name;
        this.contactInformation=contactInformation;
    }

}