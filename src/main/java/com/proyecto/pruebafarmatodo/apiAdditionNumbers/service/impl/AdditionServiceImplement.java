package com.proyecto.pruebafarmatodo.apiAdditionNumbers.service.impl;

import com.proyecto.pruebafarmatodo.apiAdditionNumbers.dto.NumberDto;
import com.proyecto.pruebafarmatodo.apiAdditionNumbers.service.AdditionService;
import org.springframework.stereotype.Service;

@Service
public class AdditionServiceImplement implements AdditionService {

    @Override
    public NumberDto calculateResult(int digit) {
        int result = 0;
        int newDigit = 0;

        for (int i = 0; i < digit; i++) {
            newDigit = newDigit + 1;
            result = result + newDigit;
        }
        NumberDto numberDto = new NumberDto();
        numberDto.setResult(result);
        return numberDto;
    }
}
