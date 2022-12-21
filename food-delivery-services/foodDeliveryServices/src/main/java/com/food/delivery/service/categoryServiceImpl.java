package com.food.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.entity.Category;
import com.food.delivery.repository.CategoryRepository;

@Service
public class categoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepo;

	@Override
	public Category addCategory(Category category) {
		category.setDeleted(false);
		return categoryRepo.save(category);
	}

	@Override
	public List<Category> getAllcategory() {
		return categoryRepo.findAll();
	}

	@Override
	public Category getcategoryById(Integer categoryId) {
		return categoryRepo.findById(categoryId).get();
	}

	@Override
	public Category updateCategoryById(Integer categoryId, Category category) {
		Optional<Category> c = categoryRepo.findById(categoryId);
		c.get().setCategoryName(category.getCategoryName());
		return categoryRepo.save(c.get());
	}
}
