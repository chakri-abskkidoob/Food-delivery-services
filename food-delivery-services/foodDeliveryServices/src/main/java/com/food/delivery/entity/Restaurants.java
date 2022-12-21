package com.food.delivery.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurants {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer restaurantId;
	public String restaurantName;
	public Integer restaurantPriority;
	public LocalDateTime createdAt;
	public LocalDateTime updatedAt;
	public Boolean deleted;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Category> categories;
}
