package com.example.form_binding.service.impl;

import com.example.form_binding.repository.ISettingRepository;
import com.example.form_binding.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingService implements ISettingService {
    @Autowired
    private ISettingRepository repository;

}
