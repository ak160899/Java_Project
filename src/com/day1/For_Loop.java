package com.day1;

public class For_Loop {

	public static void main(String[] args) {
		int fact = 5;
		/*
		 * for (int i = 1; i <= 10; i++) {
		 * 
		 * System.out.printf("%d x %d = %d\n", fact, i, fact * i);
		 * 
		 * }
		 */

		// find sum offf 8 multiple..
		int sum = 0;
		int mul = 10;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d=%d\n",mul,i,mul*i);
			sum += mul * i;
		}
System.out.println(sum);
	}

}
