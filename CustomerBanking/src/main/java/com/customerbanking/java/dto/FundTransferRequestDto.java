package com.customerbanking.java.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class FundTransferRequestDto {
	
	@NotNull(message = "Balance to be sent cannot Empty")
	private BigDecimal amount;
	@NotNull(message = "Please provide From AccountNumber")
	private Long fromAccountNumber;
	@NotNull(message = "Please provide To AccountNumber")
	private Long toAccountNumber;
	@NotNull(message = "Please provide the Transaction Type")
	private String transactionType;
	public Long getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(Long fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public Long getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(Long toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	

}
