package com.example.service.impl;

import com.example.service.ICaculatorService;
import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public Double caculator(double firstNumber, double twoNumber, String caculator) {
        switch (caculator) {
            case "Addition(+)":
                return firstNumber + twoNumber;
            case "Subtraction(-)":
                return firstNumber - twoNumber;
            case "Multiplication(*)":
                return firstNumber * twoNumber;
            case "Division(/)":
                if (twoNumber != 0) {
                    return firstNumber / twoNumber;
                } else {
                    throw new ArithmeticException();
                }

        }
        return (double) 0;
    }

}
