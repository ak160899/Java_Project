package com.EXCEPTION;

public class CustomException extends Exception {
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage()+" i am get message";
	}
	
	
	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" error occured..";
	}

	public static void main(String[] args) {
		
		
		try {
			throw new CustomException();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
	}
	
}
