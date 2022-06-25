package com.MethodOverridiing;

public class Practice1 {

	public void method1() {

		System.out.println("i am from class A");

	}

	public void method2() {
		System.out.println("hello this Akash");

	}
public static void main(String[] args) {
	
}
}

class Practice2 extends Practice1 {
	@Override
	public void method2() {
		System.out.println("hello welcome ");

	}

}
class Practice3{
	public static void main(String[] args) {
		
	
	
	Practice2 p2=new Practice2();
	p2.method2();
	/*
	 * Practice1 p1=new Practice1(); p1.method2();
	 */
	
	}
}