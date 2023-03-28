package com.example.controller;

import com.example.model.Dictionary;
import com.example.service.DictionaryService;
import com.example.service.IDictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DictionaryController {
    IDictionaryService dictionaryService = new DictionaryService();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showList() {
        return "index";
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String showResult(Model model, @RequestParam("keyword") String keyword ){
        List<Dictionary> dictionaryList = this.dictionaryService.findAll();
        for (int i = 0; i < dictionaryList.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaryList.get(i).getEn())){
                model.addAttribute("word",dictionaryList.get(i).getVn());
                model.addAttribute("key",keyword);
                return "list";
            }
        }
        return "list";
    }
}
