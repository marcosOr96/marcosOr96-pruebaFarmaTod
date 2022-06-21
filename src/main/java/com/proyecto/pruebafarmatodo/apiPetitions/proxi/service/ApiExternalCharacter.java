package com.proyecto.pruebafarmatodo.apiPetitions.proxi.service;

import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.CharacterResponse;

import java.util.List;

public interface ApiExternalCharacter {

    List<CharacterResponse> getCharactersByUrls(List<String> urls);
}
