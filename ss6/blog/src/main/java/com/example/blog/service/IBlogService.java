package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.service.impl.BlogService;

import java.util.List;

public interface IBlogService {

    List<Blog> getAll();

    void save(Blog blog);
}
