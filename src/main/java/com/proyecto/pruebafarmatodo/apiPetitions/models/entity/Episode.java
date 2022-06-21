package com.proyecto.pruebafarmatodo.apiPetitions.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "episode")
public class Episode {

    @Id
    @Column(name = "episode_id")
    private int episode;

    @Column(name = "episode_name")
    private String episodeName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "episode_id", referencedColumnName = "episode_id")
    private List<Character> characters;


}
