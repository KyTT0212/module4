package com.example.form_binding.repository.impl;

import com.example.form_binding.model.Settings;
import com.example.form_binding.repository.ISettingRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SettingRepository implements ISettingRepository {
    private static Settings settings;

    static {
        settings = new Settings("English",25,false,"Thor,King,Asgard");
        String[] languages = new String[]{"English","Vietnamese","Japanese","Chinese"};
        Integer[] pageSize = new Integer[]{5,10,15,20,25,50,100};
    }
}
