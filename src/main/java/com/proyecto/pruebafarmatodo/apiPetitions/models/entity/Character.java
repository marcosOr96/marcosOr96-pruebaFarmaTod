package com.proyecto.pruebafarmatodo.apiPetitions.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "character")
public class Character {

    @Id
    @Column(name = "character_id")
    private int id;

    private String name;
    private String species;
    private String gender;
    private String image;



}
