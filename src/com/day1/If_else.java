package com.day1;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the mark1");
		int m1=s.nextInt(); 
		System.out.println("enter the mark2");
		int m2=s.nextInt();
		System.out.println("enter the mark3");
		int m3=s.nextInt();
		
		float avg=(m1+m2+m3)*100/300;
		System.out.println(avg);

		if(avg>40&&m1>33&&m2>33&&m3>33) {
			System.out.println("congrats your promted to the next class");
		}else {
			System.out.println("sorry you failed you have to rewrite ...");
		}
		
	}

}
