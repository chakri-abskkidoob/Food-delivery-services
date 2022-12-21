package com.food.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.entity.Restaurants;
import com.food.delivery.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@PostMapping("/post")
	public Restaurants addRestaurant(@RequestBody Restaurants restaurants) {
		return restaurantService.addRestaurant(restaurants);
	}
	
	@GetMapping("/all")
	public List<Restaurants> getAllRestaurants(){
		return restaurantService.getAllRestaurants();
	}
	
	@GetMapping("/{restaurantId}")
	public Restaurants getRestaurantById(@PathVariable Integer restaurantId) {
		return restaurantService.getRestaurantById(restaurantId);
	}
	
	@PutMapping("/update/{restaurantId}")
	public Restaurants updateRestaurantById(@PathVariable Integer restaurantId, @RequestBody Restaurants restaurants) {
		return restaurantService.updateRestaurantById(restaurantId, restaurants);
	}

}
