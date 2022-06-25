package com.PracticeSet12;

import java.util.Scanner;

public class Practice2 extends Exception {
	
	@Override
	public String toString() {
		
		return super.toString()+"exception occured..";
	}
	@Override
	public String getMessage() {
		
		return super.getMessage()+" am the get message...";
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number :");
		int a;
		a=s.nextInt();
		while(a<9) {
			try {
			throw new  Practice2();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			a++;
			
		}
		
	}

}
