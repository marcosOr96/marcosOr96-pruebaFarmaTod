package com.proyecto.pruebafarmatodo.apiHappyNumbers.controller;

import com.proyecto.pruebafarmatodo.apiHappyNumbers.models.entity.HappyNumber;
import com.proyecto.pruebafarmatodo.apiHappyNumbers.service.HappyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/happyNumbers")
public class HappyController {

    @Autowired
    public HappyService happyService;

    @PostMapping
    public ResponseEntity<List<HappyNumber>> saveNumber(@RequestBody List<HappyNumber> happyNumber) {
        return ResponseEntity.ok(happyService.createNumber(happyNumber));
    }
}
