package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
@Query (value = "select b from Blog b where b.name like :name")
    List<Blog> findByName (@Param("name_blog") String name);
}
