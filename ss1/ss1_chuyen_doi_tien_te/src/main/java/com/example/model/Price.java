package com.example.model;

public class Price {
    private Integer price;

    public Price(int i) {
        this.price = i;
    }

    public Price(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
