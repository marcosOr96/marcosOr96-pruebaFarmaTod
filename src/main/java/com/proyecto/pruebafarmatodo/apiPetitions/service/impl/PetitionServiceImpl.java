package com.proyecto.pruebafarmatodo.apiPetitions.service.impl;

import com.proyecto.pruebafarmatodo.apiPetitions.mappers.CharacterMapper;
import com.proyecto.pruebafarmatodo.apiPetitions.mappers.EpisodeMapper;
import com.proyecto.pruebafarmatodo.apiPetitions.mappers.LocationMapper;
import com.proyecto.pruebafarmatodo.apiPetitions.models.dto.CharacterDto;
import com.proyecto.pruebafarmatodo.apiPetitions.models.dto.EpisodeDto;
import com.proyecto.pruebafarmatodo.apiPetitions.models.entity.Character;
import com.proyecto.pruebafarmatodo.apiPetitions.models.entity.Episode;
import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.CharacterResponse;
import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.EpisodeResponse;
import com.proyecto.pruebafarmatodo.apiPetitions.models.thirdparty.LocationResponse;
import com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.ApiExternalCharacter;
import com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.ApiExternalEpisode;
import com.proyecto.pruebafarmatodo.apiPetitions.proxi.service.ApiExternalLocation;
import com.proyecto.pruebafarmatodo.apiPetitions.repository.CharacterRepository;
import com.proyecto.pruebafarmatodo.apiPetitions.repository.EpisodeRepository;
import com.proyecto.pruebafarmatodo.apiPetitions.repository.LocationRepository;
import com.proyecto.pruebafarmatodo.apiPetitions.service.PetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PetitionServiceImpl implements PetitionService {

    @Autowired
    private ApiExternalEpisode apiExternalEpisode;

    @Autowired
    private ApiExternalCharacter apiExternalCharacter;

    @Autowired
    private ApiExternalLocation apiExternalLocation;

    @Autowired
    private EpisodeMapper episodeMapper;

    @Autowired
    private CharacterMapper characterMapper;

    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private LocationMapper locationMapper;

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public EpisodeDto getEpisodeDto(int episode) {
        EpisodeResponse episodeResponse=apiExternalEpisode.getEpisodeById(episode);
        EpisodeDto episodeDto=episodeMapper.responseToDto(episodeResponse);

        List<CharacterResponse> characterResponseList=apiExternalCharacter.getCharactersByUrls(episodeResponse.getCharacters());
        List<CharacterDto> characterDtoList=new ArrayList<>();
        for (CharacterResponse characterResponse:characterResponseList) {
            LocationResponse locationResponse=apiExternalLocation.getLocationByUrl(characterResponse.getLocation().getUrl());
            characterResponse.setLocation(locationResponse);
            CharacterDto characterDto=characterMapper.responseToDto(characterResponse);
            characterDtoList.add(characterDto);
        }
        episodeDto.setCharacters(characterDtoList);

        save(episodeResponse, characterResponseList);

        return episodeDto;
    }

    private void save(EpisodeResponse episodeResponse, List<CharacterResponse> characterResponseList){
        Episode episode=episodeMapper.responseToEntity(episodeResponse);
        List<Character> characters=characterMapper.responseToEntity(characterResponseList);
        episode.setCharacters(characters);
        characterResponseList.forEach(character -> locationRepository.save(locationMapper.responseToEntity(character.getLocation())));

        characterRepository.saveAll(characters);

        episodeRepository.save(episode);
    }
}
