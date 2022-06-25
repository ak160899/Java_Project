package com.calculatorapp;

import java.util.Scanner;

public class CalculatorApp {
	static Scanner s = new Scanner(System.in);
//	static int cas = s.nextInt();

	public static void main(String[] args) {

		System.out.println("1.Addition \n2.Subraction \n3.Multiplication \n4.Division");
		switch (s.nextInt()) {

		case 1:
			System.out.println("enter the values....");
			int add1 = s.nextInt();
			int add2 = s.nextInt();
			System.out.println(add1 + add2);
			break;

		case 2:
			System.out.println("enter the values...");
			int sub1 = s.nextInt();
			int sub2 = s.nextInt();
			System.out.println(sub1 - sub2);
			break;
		case 3:
			System.out.println("enter the values....");
			int mul1 = s.nextInt();
			int mul2 = s.nextInt();
			System.out.println(mul1 * mul2);
			break;
		case 4:
			System.out.println("enter the values....");
			int div1=s.nextInt();
			int div2=s.nextInt();
			System.out.println(div1/div2);
			break;

		}

	}

}
