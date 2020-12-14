package com.restaurant.crud.rest;

import com.restaurant.crud.domain.Restaurant;
import com.restaurant.crud.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController //Informa que a classe é um controller
@RequestMapping("/restaurants") //Mapeia a classe
public class RestaurantRest {
    @Autowired
    private RestaurantService service;

    @PostMapping("/register")//Inserir
    public void register(){

    }

    @GetMapping//Pegar dado
    public List<Restaurant> list(){
        return service.find_all();
    }
}
