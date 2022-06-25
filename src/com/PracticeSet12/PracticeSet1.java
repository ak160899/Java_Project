package com.PracticeSet12;

import java.util.Scanner;

public class PracticeSet1 {

	// Access the array Un till the valid index is given by the user...
	public static void main(String[] args) {

	int []age=new int[5];
	age[0]=20;
	age[1]=30;
    age[2]=40;
	age[3]=50;
	age[4]=60;
	
	Boolean b=true;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the index number:");
	while(b) {
	try {
		int ind=s.nextInt();
		try {
		System.out.println("Age of the Person is:" +age[ind]);
		b=false;
		}catch(Exception e) {
			System.out.println("sorry the index enterd is out of  bound...");
			System.out.println("please enter valid index :");
		}
	}catch(Exception e) {
		System.out.println("exception in level 1..");
		b=false;
	}
	}
	
	
	}

}
