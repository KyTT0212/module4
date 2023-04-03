package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BlogController {
    @Autowired
    IBlogService iBlogService;


    @GetMapping("/")
    public String showListBlog(Model model){
        model.addAttribute("blogList", iBlogService.getAll());
        return "home";
    }

    @GetMapping("/create")
    public String formCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/cretae")
    public String addCreate(Model model, @ModelAttribute Blog blog){
        model.addAttribute("blog",iBlogService.save(blog));
        return "/";
    }


}
