package com.commune.communepro.type.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commune.communepro.type.domain.Type;

public interface TypeRepository extends JpaRepository<Type, Long> {
	
	
}
