package com.day1;

import java.util.Scanner;

public class Basic_1 {

	public static void main(String[] args) {
		System.out.println("enter the five subject marks");
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the tamil mark");
		int sub1 = s.nextInt();
		System.out.println("enter the english mark");
		int sub2 = s.nextInt();
		System.out.println("enter the maths mark");
		int sub3 = s.nextInt();
		System.out.println("enter the social mark");
		int sub4 = s.nextInt();
		System.out.println("enter the science mark");
		int sub5 = s.nextInt();

		int total = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println(total);
		System.out.println("the percentage of the suriya's is:");
		float percen = total * 100 / 500;
		System.out.println(percen);

	}

}
