package com.example.service.impl;

import com.example.service.ICaculatorService;
import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public Double caculator(double num1, double num2, String caculator){
        switch (caculator){
            case "Addition(+)":
                return num1+num2;
            case "Subtraction(-)":
                return num1 - num2;
            case "Multiplication(*)":
                return num1 * num2;
            case "Division(/)":
                if (num2 != 0){
                    return num1 / num2;
                }else {
                    throw new ArithmeticException();
                }

        }
        return (double) 0;
    }

}
