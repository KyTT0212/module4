package com.example.service.impl;


import com.example.service.IPriceService;

public class PriceService implements IPriceService {

    @Override
    public Integer getResult(Integer price) {
        return price * 23000;
    }


}
