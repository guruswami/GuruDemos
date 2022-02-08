package com.customerbanking.java.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class CustomerRequestDto {

	@NotNull(message = "First Name cannot be Empty")
	private String firstName;
	@NotNull(message = "Last Name cannot be Empty")
	private String lastName;
	@NotNull(message = "Gender cannot be Empty")
	private String gender;
	@NotNull(message = "Email cannot be Empty")
	private String email;
	@NotNull(message = "Date Of Birth cannot be Empty")
	private LocalDate dob;
	@NotNull(message = "Phone Number cannot be Empty")
	private String phoneNo;
	@NotNull(message = "Address cannot be Empty")
	private String address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
