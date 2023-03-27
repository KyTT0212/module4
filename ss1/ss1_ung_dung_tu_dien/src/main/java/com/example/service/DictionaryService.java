package com.example.service;

import com.example.model.Dictionary;
import com.example.repository.DictionaryRepository;
import com.example.repository.IDictionaryRepository;

import java.util.List;

public class DictionaryService implements IDictionaryService{
    IDictionaryRepository dictionaryRepository = new DictionaryRepository();
    @Override
    public List<Dictionary> findAll() {
        return dictionaryRepository.findAll();
    }
}
