package com.restaurant.crud.rest;

import org.springframework.web.bind.annotation.*;

@RestController //Informa que a classe é um controller
@RequestMapping("/restaurant") //Mapeia a classe
public class RestaurantRest {

    @PostMapping("/register")//Inserir
    public void register(){

    }

    @GetMapping("/list")//Pegar dado
    public void list(){

    }

    @DeleteMapping("/delete/{id}")//Remover
    public void delete(){

    }

    @PutMapping("/put/{id}")//Alterar
    public void put(){

    }
}
