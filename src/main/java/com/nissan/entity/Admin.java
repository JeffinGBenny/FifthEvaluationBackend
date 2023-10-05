package com.nissan.entity;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adminId")
	private Integer adminId ;
	
	@Column(name = "adminName", nullable = false, length = 60)
	private String adminName;
	
	
	
	public Admin() {
		
	}



	



	public Integer getAdminId() {
		return adminId;
	}







	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}







	public String getAdminName() {
		return adminName;
	}



	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}





	

	

	

}
