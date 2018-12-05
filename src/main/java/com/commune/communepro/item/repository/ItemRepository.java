package com.commune.communepro.item.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commune.communepro.item.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

	public List<Item> findByItemTypeId(Long id);
	public List<Item> findByItemSubtypeId(Long id);
}
