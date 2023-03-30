package com.example.form_binding.service.impl;

import com.example.form_binding.model.EmailBox;
import com.example.form_binding.repository.IEmailBoxRepository;
import com.example.form_binding.service.IEmailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailBoxService implements IEmailBoxService {
    @Autowired
    private IEmailBoxRepository repository;

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

    @Override
    public void update(EmailBox emailBox) {
        repository.update(emailBox);
    }

}
