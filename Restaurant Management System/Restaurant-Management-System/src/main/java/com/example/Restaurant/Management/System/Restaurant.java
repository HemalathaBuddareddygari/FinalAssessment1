package com.example.Restaurant.Management.System;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@Entity
public class Restaurant {

    private String RestaurantName;
    private String RestaurantAddress;
    private String Recipes;
    protected Restaurant() {

    }

    public Restaurant(String restaurantName, String restaurantAddress, String recipes, Long id) {
        RestaurantName = restaurantName;
        RestaurantAddress = restaurantAddress;
        Recipes = recipes;
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return RestaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        RestaurantAddress = restaurantAddress;
    }

    public String getRecipes() {
        return Recipes;
    }

    public void setRecipes(String recipes) {
        Recipes = recipes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
