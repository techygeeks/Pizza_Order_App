package com.pizza.order.model;

import com.pizza.order.data.PizzaTypeAndPrice;

public class PizzaModel {

    private PizzaTypeAndPrice pizzaTypeAndPrice;

    private Integer quantity;

    public PizzaTypeAndPrice getPizzaTypeAndPrice() {
        return pizzaTypeAndPrice;
    }

    public void setPizzaTypeAndPrice(PizzaTypeAndPrice pizzaTypeAndPrice) {
        this.pizzaTypeAndPrice = pizzaTypeAndPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
