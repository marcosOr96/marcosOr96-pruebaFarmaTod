package com.proyecto.pruebafarmatodo.apiPetitions.controller;

import com.proyecto.pruebafarmatodo.apiPetitions.models.dto.EpisodeDto;
import com.proyecto.pruebafarmatodo.apiPetitions.service.PetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/petition")
public class PetitionController {

    @Autowired
    public PetitionService petitionService;

    @GetMapping("/{episode}")
    public ResponseEntity<?> readPetition(@PathVariable Integer episode) {
        EpisodeDto PetitionDto = petitionService.getEpisodeDto(episode);
        return ResponseEntity.ok(PetitionDto);
    }
}
