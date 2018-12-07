package com.commune.communepro.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commune.communepro.account.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	
}
