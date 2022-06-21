package com.proyecto.pruebafarmatodo.apiPetitions.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {

    private String name;
    private String type;
    private String dimension;
}
