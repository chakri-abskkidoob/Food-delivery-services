package com.food.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.delivery.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
