package com.nissan.entity;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class Loan {
	@Id
	@Column(name = "loanId")
	private String loanId ;
	
	@Column(name = "loanOfficerId")
	private Integer loanOfficer_Id;
	@ManyToOne
	@JoinColumn(name = "loanOfficerId", insertable = false, updatable = false)
	private LoanOfficer loanOfficerId;
	
	@Column(name = "customerId")
	private Integer customer_id;
	@ManyToOne
	@JoinColumn(name = "customerId", insertable = false, updatable = false)
	private Customer customerId;

	@Column(name = "loanAmount", nullable = false, length = 60)
	private String loanAmount;
	
	@Column(name = "verification", length = 60)
	private String verification;
	
	@Column(name = "status",  length = 60)
	private String status;

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getVerification() {
		return verification;
	}

	public void setVerification(String verification) {
		this.verification = verification;
	}

	
	
	public Integer getLoanOfficer_Id() {
		return loanOfficer_Id;
	}

	public void setLoanOfficer_Id(Integer loanOfficer_Id) {
		this.loanOfficer_Id = loanOfficer_Id;
	}

	public LoanOfficer getLoanOfficerId() {
		return loanOfficerId;
	}

	public void setLoanOfficerId(LoanOfficer loanOfficerId) {
		this.loanOfficerId = loanOfficerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Loan() {
		
	}
	
	
	

	

}
