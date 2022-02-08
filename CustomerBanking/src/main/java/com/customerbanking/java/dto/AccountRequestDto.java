package com.customerbanking.java.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AccountRequestDto {
	
	@NotNull(message = "Account Number cannot be Empty")
	@Min(value = 6, message = "Account Number should not be less than 6 digits")
	private Long accountNumber;
	@NotNull(message = "Balance cannot be Empty")
	@Min(value = 10000, message = "Amount should not be less than 10000")
	private BigDecimal balance;
	@NotEmpty(message = "Please provide account type")
	private String accountType;
	private Integer customerId;

	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
}
