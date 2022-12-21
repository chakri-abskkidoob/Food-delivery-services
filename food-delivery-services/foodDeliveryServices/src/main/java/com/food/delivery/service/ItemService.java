package com.food.delivery.service;

import java.util.List;

import com.food.delivery.entity.Item;

public interface ItemService {

	Item addItem(Item item);

	List<Item> getAllItem();

	Item getItemById(Integer itemId);

	Item updateItem(Integer itemId, Item item);

}
