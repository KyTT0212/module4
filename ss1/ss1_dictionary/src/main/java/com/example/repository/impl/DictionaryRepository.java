package com.example.repository.impl;

import com.example.model.Dictionary;
import com.example.repository.IDictionaryRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryRepository implements IDictionaryRepository {
    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();
    static {
        dictionaries.put(1, new Dictionary("hello", "hi"));
        dictionaries.put(2, new Dictionary("dog", "con chó"));
        dictionaries.put(3, new Dictionary("cat", "con mèo"));
        dictionaries.put(4, new Dictionary("cute", "kỳ bé đẹp"));
        dictionaries.put(5, new Dictionary("goodbye", "chào"));
        dictionaries.put(6, new Dictionary("rat", "con chuột"));
    }
    public List<Dictionary> findAll() {
        List<Dictionary> result = new ArrayList<>();
        result.addAll(dictionaries.values());
        return result;
    }
}
