package com.nissan.entity;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loanOfficer")
public class LoanOfficer {
	@Id
	@Column(name = "loanOfficerId")
	private String loanOfficerId ;
	
	@Column(name = "loanOfficerName", nullable = false, length = 60)
	private String loanOfficerName;

	public String getLoanOfficerId() {
		return loanOfficerId;
	}

	public void setLoanOfficerId(String loanOfficerId) {
		this.loanOfficerId = loanOfficerId;
	}

	public String getLoanOfficerName() {
		return loanOfficerName;
	}

	public void setLoanOfficerName(String loanOfficerName) {
		this.loanOfficerName = loanOfficerName;
	}

	public LoanOfficer() {
		
	}
	
	
	

	

}
