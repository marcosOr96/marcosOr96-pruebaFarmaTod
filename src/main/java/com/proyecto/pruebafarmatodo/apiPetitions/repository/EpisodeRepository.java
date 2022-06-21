package com.proyecto.pruebafarmatodo.apiPetitions.repository;

import com.proyecto.pruebafarmatodo.apiPetitions.models.entity.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode, Integer> {
}
