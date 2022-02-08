package com.customerbanking.java.serviceimpl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerbanking.java.entity.Transaction;
import com.customerbanking.java.repository.StatementRepository;
import com.customerbanking.java.repository.TransactionRepository;
import com.customerbanking.java.service.StatementService;

@Service
public class StatementServiceImpl implements StatementService {
	
	@Autowired
	StatementRepository statementRepository;
	

	@Override
	public List<Transaction> getMonthlyEStatement(long accountno, int month, int year) {
		// TODO Auto-generated method stub
		LocalDate startDate=LocalDate.of(year, month, 1);
		LocalDate lastDate=LocalDate.of(year, month, startDate.lengthOfMonth());
		return statementRepository.findByFromAccountOrToAccountAndTransactionDateBetween(accountno, accountno,startDate,lastDate);
				
		
	}

}
