package com.pizza.order.creator.service;

import com.pizza.order.creator.model.Pizza;
import com.pizza.order.creator.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaOrderCreatorService {

    @Autowired
    private PizzaRepository repo;

    public Long createPizzaOrder(Pizza pizza){
       return repo.save(pizza).getId();
    }
}
