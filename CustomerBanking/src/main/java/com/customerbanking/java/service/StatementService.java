package com.customerbanking.java.service;

import java.util.List;

import com.customerbanking.java.entity.Transaction;

public interface StatementService {
	
	List<Transaction> getMonthlyEStatement(long accountno, int month, int year);

}
