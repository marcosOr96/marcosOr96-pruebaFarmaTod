package com.proyecto.pruebafarmatodo.apiPetitions.mappers;

import com.proyecto.pruebafarmatodo.apiPetitions.models.dto.EpisodeDto;
import com.proyecto.pruebafarmatodo.apiPetitions.models.entity.Episode;
import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.EpisodeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EpisodeMapper {

    @Mappings({
            @Mapping(target = "episode", source = "id"),
            @Mapping(target = "episodeName", source = "name"),
            @Mapping(target = "characters", ignore = true)
    })
    EpisodeDto responseToDto(EpisodeResponse episodeResponse);

    @Mappings({
            @Mapping(target = "episode", source = "id"),
            @Mapping(target = "episodeName", source = "name"),
            @Mapping(target = "characters", ignore = true)
    })
    Episode responseToEntity(EpisodeResponse episodeResponse);
}
