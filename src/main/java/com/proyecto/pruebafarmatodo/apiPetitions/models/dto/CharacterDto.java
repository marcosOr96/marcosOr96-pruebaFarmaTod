package com.proyecto.pruebafarmatodo.apiPetitions.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterDto {

    private String name;
    private String species;
    private String gender;
    private String image;
    private LocationDto location;
}
