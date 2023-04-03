package com.example.blog.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity (name="Blog")

public class Blog {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "name_blog",columnDefinition = "VARCHAR(50)")
    private String name;
    @Column (name = "author", columnDefinition = "VARCHAR(225)")
    private String author;
    @Column (name = "date_created",columnDefinition = "DATE")
    private Integer dateCreated;
    @Column (name = "content", columnDefinition = "VARCHAR(225)")
    private String content;

    public Blog() {
    }

    public Blog(Integer id, String name, String author, Integer dateCreated, String content) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.dateCreated = dateCreated;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Integer dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


