package com.nissan.rest;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;

import com.nissan.entity.Loan;
import com.nissan.service.ICustomerService;
import com.nissan.util.JwtUtil;

@CrossOrigin
@RestController // combination of controller and configuration annotations
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	private APIResponse apiresponse;
	
	@Autowired
	private JwtUtil jwtUtil;
	// list
	@GetMapping("/loanRequest")
	public List<Loan> getLoanRequests()
			//@RequestHeader(value="authorization",defaultValue="")String auth)throws AccessDeniedException 
			{
		//jwtUtil.verify(auth);
		return customerService.getLoanRequests();
	}

	// search by id
	@GetMapping("/loanRequest/{id}")
	public Loan getLoanRequest(@PathVariable int id)
			//,@RequestHeader(value="authorization",defaultValue="")String auth)throws AccessDeniedException
			{
		//jwtUtil.verify(auth);
		return customerService.getLoanRequest(id);
	}

	// add employee
	@PostMapping("/loanRequest")
	public ResponseEntity<APIResponse> addLoanRequest(@RequestBody Loan loan)
			//,@RequestHeader(value="authorization",defaultValue="")String auth)throws AccessDeniedException
	{
		//jwtUtil.verify(auth);
		if(customerService.saveLoanRequest(loan)==null) {
			apiresponse.setData("Name can have only alphabets");
			apiresponse.setStatus(500);
			apiresponse.setError("Invalid name");
			
			return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
			
		}
		apiresponse.setData("Request added successfully");
		apiresponse.setStatus(200);
		
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
	}

	// update
	/*@PutMapping("/employees")
	public ResponseEntity<APIResponse> updateEmployee(@RequestBody Employee employee,
			@RequestHeader(value="authorization",defaultValue="")String auth)throws AccessDeniedException 
	{
		jwtUtil.verify(auth);
				if(employeeService.saveEmployee(employee)==null) {
					apiresponse.setData("Name can have only alphabets");
					apiresponse.setStatus(500);
					apiresponse.setError("Invalid name");
					
					return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
					
				}
				apiresponse.setData("Employee updated successfully");
				apiresponse.setStatus(200);
				
				return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);

	}
	
	@DeleteMapping("/employees/disable/{id}")
	public ResponseEntity<APIResponse> disableEmployee(@PathVariable int id,
			@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException
			{
		jwtUtil.verify(auth);
		employeeService.disableEmployee(id);
		apiresponse.setData("Employee deleted successfully");
		apiresponse.setStatus(200);
		return ResponseEntity.status(apiresponse.getStatus()).body(apiresponse);
	}
*/
	
	
	// disable or delete employee
	@DeleteMapping("/employees/{id}")
	public void deleteLoanRequest(@PathVariable int id)
			//,@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException
			{
		//jwtUtil.verify(auth);
		customerService.deleteLoanRequest(id);
	}

	
	 
	 
	  
	 
}
