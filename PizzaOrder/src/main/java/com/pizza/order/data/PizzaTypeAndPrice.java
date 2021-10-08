package com.pizza.order.data;

public enum PizzaTypeAndPrice {

    VEG("VEG",25.00),
    NON_VEG("NON-VEG",30.00);

    private String name;

    private Double price;

    PizzaTypeAndPrice(String name,Double price){
        this.name = name;
        this.price = price;
    };

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
