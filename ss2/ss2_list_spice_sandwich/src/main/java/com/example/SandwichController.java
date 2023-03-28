package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping("/")
    public String list(){
        return "index";
    }
    @RequestMapping("save")
    public String save (@RequestParam(value = "condiment", required = false) String[] condiment, Model model){
        if (condiment == null) {
            model.addAttribute("messageError", "No seasoning selected!");
            return "index";
        }
        model.addAttribute("condiment",condiment);
        return "index";
    }
}
