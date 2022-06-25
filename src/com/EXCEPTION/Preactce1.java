package com.EXCEPTION;

import java.util.*;

public class Preactce1 {
	private static void meth1() {
		// TODO Auto-generated method stub

		int[] marks = new int[5];

		marks[0] = 50;
		marks[1] = 100;
		marks[2] = 90;
		marks[3] = 40;
		marks[4] = 80;

		Scanner s = new Scanner(System.in);
		System.out.println("choose a array index to get the value:");
		try {
		int ind = s.nextInt();
		System.out.println("value of the array index is :" + marks[ind]);
		System.out.println("choose the number to divide:");
		int div = s.nextInt();
	
		System.out.println("the value after dividing the array is:" + marks[ind] / div);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured");
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured..");
			System.out.println(e);
		}catch(Exception e) {
			
			System.out.println("other exception occured...");
		}
		return;
	}
	public static void main(String[] args) {
		meth1();
		
	}
}
