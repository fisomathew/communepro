package com.commune.communepro.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commune.communepro.item.domain.Item;
import com.commune.communepro.item.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getItemByType(Long id){

		List<Item> item=new ArrayList<>();
		itemRepository.findByItemTypeId(id).forEach(item::add);
		return item;

	}
	public List<Item> getItemBySubType(Long id){

		List<Item> item=new ArrayList<>();
		itemRepository.findByItemSubtypeId(id).forEach(item::add);
		return item;

	}
}
