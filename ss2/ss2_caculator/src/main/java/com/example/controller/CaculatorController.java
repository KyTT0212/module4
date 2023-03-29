package com.example.controller;

import com.example.service.ICaculatorService;
import com.example.service.impl.CaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    private CaculatorService caculatorService;
    @RequestMapping("/")
    public String from (){
        return "/index";
    }

    @PostMapping("caculator")
    public String caculator1(@RequestParam double num1, @RequestParam double num2, @RequestParam String caculator, Model model){
        double result = 0;
        try{
            result = caculatorService.caculator(num1,num2,caculator);
        } catch (ArithmeticException arithmeticException) {
            model.addAttribute("messageError","Unknown");
        }
        model.addAttribute("caculator",caculator);
        model.addAttribute("result",result);
        return "/index";
    }
}
