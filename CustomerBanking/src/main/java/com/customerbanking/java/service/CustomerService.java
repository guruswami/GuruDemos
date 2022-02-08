package com.customerbanking.java.service;

import com.customerbanking.java.dto.CustomerRequestDto;
import com.customerbanking.java.dto.CustomerResponseDto;

public interface CustomerService {
	
	public CustomerResponseDto saveCustomer(CustomerRequestDto customerRequestDto);

}
