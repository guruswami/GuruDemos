package com.customerbanking.java.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerbanking.java.dto.FundTransferRequestDto;
import com.customerbanking.java.dto.FundTransferResponseDto;
import com.customerbanking.java.entity.Transaction;
import com.customerbanking.java.service.TransactionService;

@RestController
@Validated
public class TransactionController {

	@Autowired
	TransactionService transacionservice;
	
	@PostMapping("/fundTransfer")
	public ResponseEntity<FundTransferResponseDto> sendAmount(@Valid @RequestBody FundTransferRequestDto fundTransferRequestDto) {
		
		return ResponseEntity.status(HttpStatus.OK).body(transacionservice.performFundTransfer(fundTransferRequestDto));
		}
	
}
