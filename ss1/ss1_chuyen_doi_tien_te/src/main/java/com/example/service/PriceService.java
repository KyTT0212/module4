package com.example.service;


public class PriceService implements IPriceService{

    @Override
    public Integer getResult(Integer price) {
        return price * 23000;
    }


}
