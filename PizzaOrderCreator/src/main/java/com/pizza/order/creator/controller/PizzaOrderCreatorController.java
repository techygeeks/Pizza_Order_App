package com.pizza.order.creator.controller;

import com.pizza.order.creator.model.Pizza;
import com.pizza.order.creator.service.PizzaOrderCreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(path="pizza-order-creator")
public class PizzaOrderCreatorController {

    @Autowired
    PizzaOrderCreatorService service;

    @PostMapping(path = "/pizza")
    public ResponseEntity createAndPersistOrder(@RequestBody Pizza pizza){
        Long id = service.createPizzaOrder(pizza);
        URI uri = URI.create("http://localhost:8081/pizza-order-creator/pizza/" + id);
        return ResponseEntity.created(uri).build();
    }

}
