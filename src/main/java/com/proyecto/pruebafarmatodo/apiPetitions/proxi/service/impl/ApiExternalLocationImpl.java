package com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.impl;

import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.LocationResponse;
import com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.ApiExternalLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiExternalLocationImpl implements ApiExternalLocation {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public LocationResponse getLocationByUrl(String url) {
        return restTemplate.getForObject(url, LocationResponse.class);
    }
}
