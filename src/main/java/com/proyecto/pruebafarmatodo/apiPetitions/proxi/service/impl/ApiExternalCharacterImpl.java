package com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.impl;

import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.CharacterResponse;
import com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.ApiExternalCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiExternalCharacterImpl implements ApiExternalCharacter {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<CharacterResponse> getCharactersByUrls(List<String> urls) {
        List<CharacterResponse> response=new ArrayList<>();
        for (String url:urls) {
            response.add(restTemplate.getForObject(url, CharacterResponse.class));
        }
        return response;
    }
}
