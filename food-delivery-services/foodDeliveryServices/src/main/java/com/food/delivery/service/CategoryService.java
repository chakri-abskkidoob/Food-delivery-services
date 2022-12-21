package com.food.delivery.service;

import java.util.List;

import com.food.delivery.entity.Category;

public interface CategoryService {

	Category addCategory(Category category);

	List<Category> getAllcategory();

	Category getcategoryById(Integer categoryId);

	Category updateCategoryById(Integer categoryId, Category category);

}
