package com.pizza.order.controller;

import com.pizza.order.model.PizzaModel;
import com.pizza.order.transformer.ObjectTransformer;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("/pizza-order")
public class PizzaOrderController {

    /*@Autowired
    private JmsTemplate jmsTemplate;
    */

    @PostMapping(path= "/pizza")
    public ResponseEntity createPizzaOrder(@RequestBody @NonNull PizzaModel pizzaModel){
        //MQ approach
        /*
        System.out.println(jmsTemplate.getDefaultDestinationName());
        jmsTemplate.setDefaultDestinationName("localhost");
        Map<String,String> map = new HashMap();
        map.put("Name",pizzaModel.getPizzaTypeAndPrice().getName());
        map.put("Price",pizzaModel.getPizzaTypeAndPrice().getPrice().toString());
        map.put("qty",pizzaModel.getQuantity().toString());
        jmsTemplate.convertAndSend(map);
        */
        //call another service API

        String uri = "Http://localhost:8081/pizza-order-creator/pizza";
        RestTemplate restTemplate = new RestTemplate();
        URI location = restTemplate.postForLocation(uri,ObjectTransformer.transform(pizzaModel));
        return ResponseEntity.created(location).build();
    }

}
