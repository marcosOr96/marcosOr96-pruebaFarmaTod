package com.proyecto.pruebafarmatodo.apiPetitions.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpisodeDto {

    private int episode;
    private String episodeName;
    private List<CharacterDto> characters;
}
