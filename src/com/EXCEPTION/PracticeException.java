package com.EXCEPTION;

import java.util.Scanner;

public class PracticeException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "voters age cannot be less than 18";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "age less than 18";
	}

	private static int age(int age) throws PracticeException {
		if (age < 18) {

			throw new PracticeException();
		}
		int ag = age;
		System.out.println("your eligible to vote... :" + ag);

		return ag;

	}

	public static void main(String[] args) {

		try {
			int a1 = age(17);
			// System.out.println(a1);
		} catch (PracticeException e) {

			// System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		finally {
			System.out.println("program exited..");
		}
	}

}

class th extends PracticeException {

	static Scanner s = new Scanner(System.in);

	static boolean con = true;

	private static void run(int age) {

		try {
			if (age < 18)

				throw new th();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} 
		
		finally {
			System.out.println("program exited...");

		}
return;
	}

	public static void main(String[] args) {
		
		while (con) {
			int age=s.nextInt();
			run(age);
              if(age<18) {
            	  con=true;
              }else {
            	  con=false;
            	  System.out.println("age greater than 18...");
              }
		}

	}
}