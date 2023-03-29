package com.example.form_binding.repository;

import com.example.form_binding.model.EmailBox;

import java.util.List;

public interface EmailBoxRepository {

    List<EmailBox> findAll();

    EmailBox findById(int id);
    String[] getLanguages();
    Integer[] getPageSize();
}
