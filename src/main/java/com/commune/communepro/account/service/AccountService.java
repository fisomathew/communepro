package com.commune.communepro.account.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commune.communepro.account.domain.Account;
import com.commune.communepro.account.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAllAccounts(){

		List<Account> accounts=new ArrayList<>();
		accountRepository.findAll().forEach(accounts::add);
		return accounts;

	}

}
