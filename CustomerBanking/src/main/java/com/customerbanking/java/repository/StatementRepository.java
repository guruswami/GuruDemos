package com.customerbanking.java.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customerbanking.java.entity.Transaction;

@Repository
public interface StatementRepository extends JpaRepository<Transaction, Integer> {

	List<Transaction> findByFromAccountOrToAccountAndTransactionDateBetween(Long long1,Long long2, LocalDate date1,LocalDate date2);
}
