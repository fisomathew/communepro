package com.commune.communepro.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commune.communepro.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
	
}
