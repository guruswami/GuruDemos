package com.customerbanking.java.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerbanking.java.dto.CustomerRequestDto;
import com.customerbanking.java.dto.CustomerResponseDto;
import com.customerbanking.java.service.CustomerService;

@RestController
@Validated
public class CustomerController {
    
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<CustomerResponseDto> saveCustomer(@Valid @RequestBody CustomerRequestDto customerRequestDto) {
		return ResponseEntity.status(HttpStatus.OK).body(customerService.saveCustomer(customerRequestDto));
	}
}
