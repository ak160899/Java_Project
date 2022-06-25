package com.day1;

import java.util.Scanner;

public class Calculate_IncomeTax {
	
	public static void main(String[] args) {
		
		//tax paid by employee to the government...
		
		Scanner s=new Scanner(System.in);
		
		float amount=s.nextFloat();
		float tax=0;
		
		if(amount<2.5) {
			
			tax=tax+0;
			System.out.println("no incomes for this amount");
		}else if(amount>2.5f&&amount<=5.0f) {
			//tax=tax*0.02f+(5.0f-2.0f);
			
			tax=tax*0.05f+(amount-5.0f);
			System.out.println(tax);
		}
		
		
	}

}
