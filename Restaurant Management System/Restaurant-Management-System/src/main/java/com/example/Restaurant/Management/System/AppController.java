package com.example.Restaurant.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class AppController {
    @Autowired
    private RestaurantService service;

    @RequestMapping("/")

    public String ViewHomePage(Model model) {
        List<Restaurant> restaurantList = service.listAll();
        model.addAttribute("restaurantList", restaurantList);
        return "index";
    }

    @RequestMapping("/new")

    public String ShowNewRestaurantPage(Model model) {
        Restaurant restaurant = new Restaurant();

model.addAttribute("Restaurant" ,restaurant);
        return "new_restaurant";
    }
    @RequestMapping(value="/save",method =RequestMethod.POST)
    public String SaveRestaurant(@ModelAttribute("Restaurant")Restaurant Restaurant) {
        service.save(Restaurant);
        return "redirect:/";
    }
     @RequestMapping("edit/{id}")
             public ModelAndView ShowEditStudentPage(@PathVariable(name="id") int id)
        {
            ModelAndView mav=new ModelAndView("edit_restaurant");
            Restaurant restaurant=service.get(id);
            mav.addObject("restuarent" ,restaurant);
                    return mav;

        }
        @RequestMapping("delete/{id}")
    public String deleteStudent(@PathVariable(name="id") int id)
        {
            service.delete(id);
            return "redirect:/";
        }


}




