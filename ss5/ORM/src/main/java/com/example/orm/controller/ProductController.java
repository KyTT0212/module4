package com.example.orm.controller;

import com.example.orm.model.Product;
import com.example.orm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/", "/trang-chu"})
public class ProductController {
    @Autowired
    private IProductService service;

    @GetMapping("")
    private String home(@RequestParam(required = false, defaultValue = "") String name, Model model) {
        model.addAttribute("name", name);
        List<Product> products = service.findAll(name);
        model.addAttribute(products);
        return "view";
    }

    @GetMapping("/create")
    private String formCreate(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    private String createProduct(@ModelAttribute Product product, Model model) {
        model.addAttribute("product", service.save(product));
        return "redirect:/trang-chu";
    }

    @GetMapping("/update/{id}")
    private String formUpdate(@PathVariable int id, Model model) {
        model.addAttribute("product", service.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String performUpdate(@ModelAttribute Product product, Model model) {
        service.updateProduct(product.getId(), product);
        model.addAttribute("product", product);
        return "redirect:/trang-chu";
    }

    @GetMapping("/delete")
    public String performDelete(@RequestParam int deleteId) {
        service.deleteProduct(deleteId);
        return "redirect:/trang-chu";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, Model model) {
        model.addAttribute("product", service.findById(id));
        return "detail";
    }
}
