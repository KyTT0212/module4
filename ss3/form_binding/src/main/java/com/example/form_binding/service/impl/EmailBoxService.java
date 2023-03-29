package com.example.form_binding.service.impl;

import com.example.form_binding.model.EmailBox;
import com.example.form_binding.repository.EmailBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailBoxService implements com.example.form_binding.service.EmailBoxService {
    @Autowired
    private EmailBoxRepository repository;

    @Override
    public List<EmailBox> findAll() {
        return repository.findAll();
    }

    @Override
    public EmailBox findById(int id) {
        return repository.findById(id);
    }

    @Override
    public String[] getLanguages() {
        return repository.getLanguages();
    }

    @Override
    public Integer[] getPageSize() {
        return repository.getPageSize();
    }

}
