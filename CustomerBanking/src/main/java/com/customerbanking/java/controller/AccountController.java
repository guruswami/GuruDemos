package com.customerbanking.java.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerbanking.java.dto.AccountRequestDto;
import com.customerbanking.java.dto.AccountResponseDto;
import com.customerbanking.java.service.AccountService;

@RestController
@Validated
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/saveAccountDetails")
	public ResponseEntity<AccountResponseDto> saveAccountDetails(@Valid @RequestBody AccountRequestDto accountRequestDto)  {
         return ResponseEntity.status(HttpStatus.OK).body(accountService.saveAccountDetails(accountRequestDto));
}
}