package com.example.demo;

public class ExceptionUser {
	private String errorMessage;
	private String requestedURI;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getRequestedURI() {
		return requestedURI;
	}
	public void callerURI(String requestedURI) {
		this.requestedURI = requestedURI;
	}
	
	

}
