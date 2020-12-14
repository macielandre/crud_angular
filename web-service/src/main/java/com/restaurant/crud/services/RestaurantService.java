package com.restaurant.crud.services;

import com.restaurant.crud.domain.Restaurant;
import com.restaurant.crud.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> find_all(){
        return repository.findAll();
    }
}
