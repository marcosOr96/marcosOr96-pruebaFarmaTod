package com.proyecto.pruebafarmatodo.apiHappyNumbers.service.impl;

import com.proyecto.pruebafarmatodo.apiHappyNumbers.models.entity.HappyNumber;
import com.proyecto.pruebafarmatodo.apiHappyNumbers.service.HappyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HappyServiceImplement implements HappyService {


    @Override
    public List<HappyNumber> createNumber(List<HappyNumber> happyNumbers) {
        List<HappyNumber> result = new ArrayList<>();
        for (HappyNumber happyNumber : happyNumbers) {
            List<Integer> previous = new ArrayList<>();
            int numberImplement = happyNumber.getNumber();
            HappyNumber newNumber = new HappyNumber();
            boolean stop = false;

            newNumber.setNumber(happyNumber.getNumber());

            while (!stop) {
                if (numberImplement == 1) {
                    newNumber.setHappy(true);
                    result.add(newNumber);
                    stop = true;
                }
                if (previous.contains(numberImplement)){
                    newNumber.setHappy(false);
                    result.add(newNumber);
                    stop = true;
                }
                else {
                    previous.add(numberImplement);
                    numberImplement = calculateAddition(numberImplement);
                }
            }
        }
        return result;
    }

    private int calculateAddition(int numberUsed){
        int number = numberUsed;
        int addition = 0;

        while (number > 9) {
            int residue = number % 10;
            addition = addition + (residue * residue);
            number = number / 10;
        }
        addition = addition + (number * number);
        return addition;
    }
}
