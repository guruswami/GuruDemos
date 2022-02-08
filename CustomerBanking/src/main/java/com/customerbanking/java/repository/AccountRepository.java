package com.customerbanking.java.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerbanking.java.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

	Optional<Account> findByAccountNumber(Long fromAccountNumber);
	
	

}
