package com.example.form_binding.controller;

import com.example.form_binding.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SettingController {
    @Autowired
    private ISettingService service;
    @RequestMapping({"/","trang-chu","index"})
    public String formSettings(){
        return "index";
    }
}
