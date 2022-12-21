package com.food.delivery.service;

import java.util.List;

import com.food.delivery.entity.Restaurants;


public interface RestaurantService {

	List<Restaurants> getAllRestaurants();

	Restaurants addRestaurant(Restaurants restaurants);

	Restaurants getRestaurantById(Integer restaurantId);

	Restaurants updateRestaurantById(Integer restaurantId, Restaurants restaurants);

}
