package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.Validation;

import com.nissan.entity.Loan;
import com.nissan.repo.ICustomerRepository;
import com.nissan.repo.ILoanRepository;
@Transactional
@Service
public class CustomerServiceImple implements ICustomerService {


@Autowired
private ILoanRepository loanRepo;

@Autowired
private Validation validation;
public List<Loan> getLoanRequests() {
// TODO Auto-generated method stub
return (List<Loan>) loanRepo.findAll();
}

public Loan saveLoanRequest(Loan loan) {

return loanRepo.save(loan) ;

}


public Loan getLoanRequest(int id) {
// TODO Auto-generated method stub
return loanRepo.findById(id).orElseThrow(()->new RuntimeException("Employee not found for id "+id));
}


public void deleteLoanRequest(int id) {
// TODO Auto-generated method stub
loanRepo.deleteById(id);
}







}
