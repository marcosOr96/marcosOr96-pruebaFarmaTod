package com.proyecto.pruebafarmatodo.apiPetitions.mappers;

import com.proyecto.pruebafarmatodo.apiPetitions.models.dto.CharacterDto;
import com.proyecto.pruebafarmatodo.apiPetitions.models.entity.Character;
import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.CharacterResponse;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = {LocationMapper.class})
public interface CharacterMapper {

    CharacterDto responseToDto(CharacterResponse characterResponse);

    List<Character> responseToEntity(List<CharacterResponse> characterResponse);
}
