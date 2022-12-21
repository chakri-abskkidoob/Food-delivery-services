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

import com.food.delivery.entity.Item;
import com.food.delivery.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@PostMapping("/post")
	public Item addItem(@RequestBody Item item) {
		return itemService.addItem(item);
	}
	
	@GetMapping("/all")
	public List<Item> getAllItem(){
		return itemService.getAllItem();
	}
	
	@GetMapping("/{itemId}")
	public Item getItemById(@PathVariable Integer itemId) {
		return itemService.getItemById(itemId);
	}
	
	@PutMapping("/update/{itemId}")
	public Item updateItem(@PathVariable Integer itemId, @RequestBody Item item) {
		return itemService.updateItem(itemId, item);
	}
	
}
