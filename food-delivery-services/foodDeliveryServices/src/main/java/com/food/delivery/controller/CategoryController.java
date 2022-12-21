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

import com.food.delivery.entity.Category;
import com.food.delivery.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/post")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}
	
	@GetMapping("/all")
	public List<Category> getAllCategory(){
		return categoryService.getAllcategory();
	}
	
	@GetMapping("/{categoryId}")
	public Category getCategoryById(@PathVariable Integer categoryId) {
		return categoryService.getcategoryById(categoryId);
	}
	
	@PutMapping("/update/{categoryId}")
	public Category updateCategoryById(@PathVariable Integer categoryId, @RequestBody Category category) {
		return categoryService.updateCategoryById(categoryId, category);
	}
}
