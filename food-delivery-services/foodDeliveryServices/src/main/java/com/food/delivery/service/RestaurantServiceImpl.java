package com.food.delivery.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.entity.Restaurants;
import com.food.delivery.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	private RestaurantRepository restaurantRepo;

	@Override
	public List<Restaurants> getAllRestaurants() {
		return restaurantRepo.findAll();
	}

	@Override
	public Restaurants addRestaurant(Restaurants restaurants) {
		restaurants.setCreatedAt(LocalDateTime.now());
		restaurants.setDeleted(false);
		return restaurantRepo.save(restaurants);
	}

	@Override
	public Restaurants getRestaurantById(Integer restaurantId) {
		return restaurantRepo.findById(restaurantId).get();
	}

	@Override
	public Restaurants updateRestaurantById(Integer restaurantId, Restaurants restaurants) {
			Optional<Restaurants> restaurant = restaurantRepo.findById(restaurantId);
			if(restaurant.isPresent()) {
				restaurant.get().setRestaurantName(restaurants.getRestaurantName());
				restaurant.get().setUpdatedAt(LocalDateTime.now());
				
				return restaurantRepo.save(restaurant.get());
			}
			else {
				return restaurant.get();
			}
			
	}
}
