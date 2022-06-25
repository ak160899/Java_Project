package com.EXCEPTION;

import java.util.Scanner;

public class NesetedTryCatch {

	private static void meth2() {

		int[] marks = new int[5];

		marks[0] = 50;
		marks[1] = 100;
		marks[2] = 90;
		marks[3] = 40;
		marks[4] = 80;

		Scanner s = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("enter the index number:");
			try {
				int ind = s.nextInt();
		
				try {
					System.out.println("value of the index elemnt is:" + marks[ind]);
					b=false;
				
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("array out of exception ");
					System.out.println("level 2 exception...");
				}
				
			} catch (Exception e) {
				b=false;
				System.out.println("level 1 exception...");
			}
		}
	}

	public static void main(String[] args) {
		meth2();

	}
}
