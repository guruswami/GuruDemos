package com.customerbanking.java.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerbanking.java.dto.CustomerRequestDto;
import com.customerbanking.java.dto.CustomerResponseDto;
import com.customerbanking.java.entity.Customer;
import com.customerbanking.java.repository.CustomerRepository;
import com.customerbanking.java.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	@Override
	public CustomerResponseDto saveCustomer(CustomerRequestDto customerRequestDto) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		BeanUtils.copyProperties(customerRequestDto, customer);
		Customer mainuser=customerRepository.save(customer);
		CustomerResponseDto customerResponseDto=new CustomerResponseDto();
		BeanUtils.copyProperties(mainuser, customerResponseDto);
		return customerResponseDto; 
	}

}
