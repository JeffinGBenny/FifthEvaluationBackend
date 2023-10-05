package com.nissan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.entity.Admin;
import com.nissan.entity.Customer;
import com.nissan.entity.Loan;

@Repository
public interface ILoanRepository extends CrudRepository<Loan, Integer> {
	
	
	
}
