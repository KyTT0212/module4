package com.example.form_binding.service;

import com.example.form_binding.model.EmailBox;

import java.util.List;

public interface IEmailBoxService {
    List<EmailBox> findAll();
    EmailBox findById(int id);

    String[] getLanguages();
    Integer[] getPageSize();

    void update(EmailBox emailBox);
}
