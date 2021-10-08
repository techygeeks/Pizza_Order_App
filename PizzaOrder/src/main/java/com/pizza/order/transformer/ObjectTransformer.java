package com.pizza.order.transformer;

import com.pizza.order.model.Pizza;
import com.pizza.order.model.PizzaModel;

public class ObjectTransformer {

    public static Pizza transform(PizzaModel pizzaModel){
        return new Pizza(pizzaModel.getPizzaTypeAndPrice().getName(),pizzaModel.getPizzaTypeAndPrice().getPrice(),pizzaModel.getQuantity());
    }
}
