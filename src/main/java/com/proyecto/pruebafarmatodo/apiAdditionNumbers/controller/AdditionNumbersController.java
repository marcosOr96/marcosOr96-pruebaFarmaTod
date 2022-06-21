package com.proyecto.pruebafarmatodo.apiAdditionNumbers.controller;

import com.proyecto.pruebafarmatodo.apiAdditionNumbers.service.impl.AdditionServiceImplement;
import com.proyecto.pruebafarmatodo.apiAdditionNumbers.dto.NumberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculateNumbers")
public class AdditionNumbersController {

    @Autowired
    public AdditionServiceImplement additionService;

    @GetMapping("/{digit}")
    public ResponseEntity<?> calculateResult(@PathVariable("digit") int digit) {
        NumberDto digitResult = additionService.calculateResult(digit);
        return ResponseEntity.ok(digitResult);
    }
}
