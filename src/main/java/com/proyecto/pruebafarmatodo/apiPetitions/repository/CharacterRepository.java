package com.proyecto.pruebafarmatodo.apiPetitions.repository;

import com.proyecto.pruebafarmatodo.apiPetitions.models.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Integer> {
}
