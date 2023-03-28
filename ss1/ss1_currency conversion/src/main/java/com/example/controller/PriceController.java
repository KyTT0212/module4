package com.example.controller;

import com.example.service.IPriceService;
import com.example.service.impl.PriceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PriceController {
    IPriceService priceService = new PriceService();
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String showResult(){
        return "index";
    }

    @RequestMapping(value = "/viewPrice",method = RequestMethod.POST)
    public String doShowResult(Model model,@RequestParam ("price") Integer price){
        model.addAttribute("result",priceService.getResult(price));
        return "list";
    }



}
