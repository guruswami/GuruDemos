package com.customerbanking.java.service;

import com.customerbanking.java.dto.AccountRequestDto;
import com.customerbanking.java.dto.AccountResponseDto;


public interface AccountService {
	
	public AccountResponseDto saveAccountDetails(AccountRequestDto accountRequestDto) ;

}
