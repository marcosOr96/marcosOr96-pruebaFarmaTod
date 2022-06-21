package com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpisodeResponse {

    private int id;
    private String name;
    private List<String> characters;
}
