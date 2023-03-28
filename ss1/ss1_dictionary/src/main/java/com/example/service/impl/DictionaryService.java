package com.example.service.impl;

import com.example.model.Dictionary;
import com.example.repository.impl.DictionaryRepository;
import com.example.repository.IDictionaryRepository;
import com.example.service.IDictionaryService;

import java.util.List;

public class DictionaryService implements IDictionaryService {
    IDictionaryRepository dictionaryRepository = new DictionaryRepository();
    @Override
    public List<Dictionary> findAll() {
        return dictionaryRepository.findAll();
    }
}
