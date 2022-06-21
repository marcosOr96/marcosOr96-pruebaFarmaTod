package com.proyecto.pruebafarmatodo.apiPetitions.mappers;

import com.proyecto.pruebafarmatodo.apiPetitions.models.dto.LocationDto;
import com.proyecto.pruebafarmatodo.apiPetitions.models.entity.Location;
import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.LocationResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationMapper {

    LocationDto responseToDto(LocationResponse locationResponse);

    Location responseToEntity(LocationResponse locationResponse);

}
