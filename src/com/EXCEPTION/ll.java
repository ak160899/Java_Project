package com.EXCEPTION;

import java.util.Scanner;

public class ll {

	public static void main(String[] args) {
		int a=10;
		String b="20";
		Scanner s=new Scanner(System.in);
	//int c=	Integer.parseInt(b);
		
		try {
			System.out.println(10/0);
		}
		finally {
			
			System.out.println("block  execeted....");
		}
		}
		
	}


