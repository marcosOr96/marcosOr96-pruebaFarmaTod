package com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterResponse {

    private int id;
    private String name;
    private String species;
    private String gender;
    private String image;
    private LocationResponse location;
}
