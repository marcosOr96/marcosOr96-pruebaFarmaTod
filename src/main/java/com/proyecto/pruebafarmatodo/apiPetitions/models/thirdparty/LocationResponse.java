package com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationResponse {

    private int id;
    private String name;
    private String url;
    private String type;
    private String dimension;
}
