package com.customerbanking.java.serviceimpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.customerbanking.java.dto.AccountRequestDto;
import com.customerbanking.java.dto.AccountResponseDto;
import com.customerbanking.java.entity.Account;
import com.customerbanking.java.entity.Customer;
import com.customerbanking.java.exception.GlobalException;
import com.customerbanking.java.repository.AccountRepository;
import com.customerbanking.java.repository.CustomerRepository;
import com.customerbanking.java.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public AccountResponseDto saveAccountDetails(AccountRequestDto accountRequestDto)   {
		// TODO Auto-generated method stub
		Optional<Customer> optional=customerRepository.findById(accountRequestDto.getCustomerId());
		if (optional.isEmpty()) {
		   System.out.println("No customer id is exits"+accountRequestDto.getCustomerId()); 
		
	    }else {
		Account account=new Account();
		account.setAccountNumber(accountRequestDto.getAccountNumber());
		account.setAccountType(accountRequestDto.getAccountType());
		account.setBalance(accountRequestDto.getBalance());
		Customer customer=customerRepository.findByCustomerId(accountRequestDto.getCustomerId());
		account.setCustomer(customer);
		accountRepository.save(account);
		AccountResponseDto accountResponseDto=new AccountResponseDto();
		BeanUtils.copyProperties(account, accountResponseDto);
		//return "Account Details saved sucessfully";
		return accountResponseDto;
	    }
		return null;
		
		
		
	}

}
