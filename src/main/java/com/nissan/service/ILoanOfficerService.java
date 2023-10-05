package com.nissan.service;

import java.util.List;


import com.nissan.entity.Loan;

public interface ILoanOfficerService {

	// list
	public List<Loan> getLoanRequests();

	// insert
	public Loan saveLoanRequest(Loan loan);

	// update by id
	public Loan getLoanRequest(int id);

	public void deleteLoanRequest(int id);

	

}
