package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Product;
import com.example.thymeleaf.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService service;

    @RequestMapping({"/","/trang-chu"})
    private String home(Model model){
        List<Product> products = service.findAll();
        model.addAttribute(products);
        return "view";
    }

    @GetMapping("/create")
    private String formCreate(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping ("/create")
    private String createProduct(@ModelAttribute Product product, Model model){
        model.addAttribute("product",service.save(product));
        return "redirect:/trang-chu";
    }

    @GetMapping ("/update/{id}")
    private String formUpdate(@PathVariable int id, Model model){
        model.addAttribute("product",service.findById(id));
        return "update";
    }
}
