package com.proyecto.pruebafarmatodo.apiPetitions.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "location")
public class Location {

    @Id
    @Column(name = "location_id")
    private int id;

    private String name;
    private String type;
    private String dimension;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", referencedColumnName = "location_id")
    private Character character;
}
