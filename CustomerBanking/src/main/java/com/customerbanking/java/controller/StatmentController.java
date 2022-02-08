package com.customerbanking.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customerbanking.java.entity.Transaction;
import com.customerbanking.java.service.StatementService;
import com.customerbanking.java.service.TransactionService;

@RestController
@Validated
public class StatmentController {

	@Autowired
	StatementService statementService;
	
	@GetMapping("/monthly/{accountno}/{month}/{year}")
	public List<Transaction> getMonthlyEStatement(@PathVariable long accountno,@PathVariable int month,@PathVariable int year) {
		return statementService.getMonthlyEStatement(accountno, month, year);
	}
}
