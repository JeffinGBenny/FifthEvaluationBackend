package com.nissan.entity;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId")
	private Integer customerId ;
	
	@Column(name = "customerName", nullable = false, length = 60)
	private String customerName;
	
	private boolean isActive = true;
	
	public Customer() {
		
	}




	public String getCustomerName() {
		return customerName;
	}




	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




	public Integer getLoanId() {
		return loanId;
	}




	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}




	




	



	public Integer getCustomerId() {
		return customerId;
	}




	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}








	@Column(name = "loan_id", nullable = false, length = 60)
	private Integer loanId;

	public boolean isActive() {
		return isActive;
	}




	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	

	
	

	

	

	

	

}
