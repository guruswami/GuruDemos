package com.customerbanking.java.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.customerbanking.java.dto.FundTransferRequestDto;
import com.customerbanking.java.dto.FundTransferResponseDto;
import com.customerbanking.java.entity.Transaction;

public interface TransactionService {
	
	public FundTransferResponseDto performFundTransfer(FundTransferRequestDto fundTransferRequestDto);
	 
	

}
