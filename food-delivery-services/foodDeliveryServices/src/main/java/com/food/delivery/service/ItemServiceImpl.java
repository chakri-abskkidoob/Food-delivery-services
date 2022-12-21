package com.food.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.delivery.entity.Item;
import com.food.delivery.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepository itemRepo;

	@Override
	public Item addItem(Item item) {
		return itemRepo.save(item);
	}

	@Override
	public List<Item> getAllItem() {
		return itemRepo.findAll();
	}

	@Override
	public Item getItemById(Integer itemId) {
		return itemRepo.findById(itemId).get();
	}

	@Override
	public Item updateItem(Integer itemId, Item item) {
		Optional<Item> i = itemRepo.findById(itemId);
//		i.get().setItemName(item.getItemName());
		i.get().setItemName(item.getItemName());
		i.get().setItemPrice(item.getItemPrice());
		return itemRepo.save(i.get());
	}

}
