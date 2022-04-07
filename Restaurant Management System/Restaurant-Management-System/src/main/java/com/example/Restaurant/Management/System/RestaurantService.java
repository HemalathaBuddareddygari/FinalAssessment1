package com.example.Restaurant.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class RestaurantService {
    @Autowired RestaurantRepository repo;

    List<Restaurant> listAll() {
        return repo.findAll();
    }
    public void save(Restaurant restaurant)
    {
        repo.save(restaurant);
    }
    public Restaurant get(long id)
    {
        return repo.getById(id);
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }
}
