package com.pizza.order.creator.repository;

import com.pizza.order.creator.model.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza, Long> {
}
