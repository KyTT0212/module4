package com.example.form_binding.repository.impl;

import com.example.form_binding.model.EmailBox;
import com.example.form_binding.repository.IEmailBoxRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailBoxRepository implements IEmailBoxRepository {
    private static List<EmailBox> emailBox = new ArrayList<>();
    private String[] languages = new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
    private Integer[] pageSize = new Integer[]{5, 10, 15, 20, 25, 50, 100};

    static {
        emailBox.add(new EmailBox(1, "English", 25, false, "Thor,King,Asgard"));
        emailBox.add(new EmailBox(2, "Vietnamese", 5, false, "Thor,King,Asgard"));
    }

    public String[] getLanguages() {
        return languages;
    }

    public Integer[] getPageSize() {
        return pageSize;
    }

    @Override
    public void update(EmailBox emailBox) {
        emailBox.setId(emailBox.getId());
        emailBox.setLanguages(emailBox.getLanguages());
        emailBox.setPageSize(emailBox.getPageSize());
        emailBox.setSpamsFiller(emailBox.getSpamsFiller());
        emailBox.setSignature(emailBox.getSignature());
    }

    @Override
    public List<EmailBox> findAll() {
        return emailBox;
    }

    @Override
    public EmailBox findById(int id) {
        for (EmailBox emailBox : emailBox) {
            if (emailBox.getId().equals(id)) {
                return emailBox;
            }
        }
        return null;
    }

}
