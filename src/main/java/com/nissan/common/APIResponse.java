package com.nissan.common;

import org.springframework.stereotype.Component;

@Component
public class APIResponse {

	private Integer status;
	private Object data;
	private Object error;

	

	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}



	public Object getData() {
		return data;
	}



	public void setData(Object data) {
		this.data = data;
	}



	public Object getError() {
		return error;
	}



	public void setError(Object error) {
		this.error = error;
	}



	public APIResponse() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "APIResponse [status=" + status + ", data=" + data + ", error=" + error + "]";
	}
	
	

}
