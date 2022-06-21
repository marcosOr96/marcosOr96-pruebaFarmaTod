package com.proyecto.pruebafarmatodo.apiPetitions.proxi.service;

import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.EpisodeResponse;

public interface ApiExternalEpisode {

    EpisodeResponse getEpisodeById(int id);
}
