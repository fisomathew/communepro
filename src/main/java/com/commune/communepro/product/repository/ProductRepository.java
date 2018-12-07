package com.commune.communepro.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commune.communepro.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
