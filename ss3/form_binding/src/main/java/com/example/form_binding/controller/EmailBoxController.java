package com.example.form_binding.controller;

import com.example.form_binding.model.EmailBox;
import com.example.form_binding.service.EmailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmailBoxController {
    @Autowired
    private EmailBoxService service;
    @RequestMapping({"/","trang-chu","index"})
    public String listEmail(Model model){
        model.addAttribute("emailBox",service.findAll());
        return "index";
    }

    @GetMapping("update/{id}")
    public String formSettings(@PathVariable("id") int id , Model model){
        EmailBox emailBox = service.findById(id);
        model.addAttribute("getLanguages",service.getLanguages());
        model.addAttribute("getPageSize",service.getPageSize());
        model.addAttribute("emailBox",emailBox);
        return "update";
    }

    @PostMapping("update")
    public String resultSettings(Model model){
        model.addAttribute(@ModelAttribute EmailBox )
    }
}
