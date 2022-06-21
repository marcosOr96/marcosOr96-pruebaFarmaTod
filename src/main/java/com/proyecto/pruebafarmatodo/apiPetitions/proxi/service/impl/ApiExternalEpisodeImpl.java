package com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.impl;

import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.EpisodeResponse;
import com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.ApiExternalEpisode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiExternalEpisodeImpl implements ApiExternalEpisode {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.path.episode}")
    private String urlEpisode;

    @Override
    public EpisodeResponse getEpisodeById(int id) {
        String url=urlEpisode+id;
        return restTemplate.getForObject(url, EpisodeResponse.class);

    }
}
