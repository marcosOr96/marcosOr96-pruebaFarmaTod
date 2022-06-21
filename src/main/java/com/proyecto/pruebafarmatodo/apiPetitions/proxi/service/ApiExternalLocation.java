package com.proyecto.pruebafarmatodo.apiPetitions.proxi.service;

import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.LocationResponse;

public interface ApiExternalLocation {
    LocationResponse getLocationByUrl(String url);
}
