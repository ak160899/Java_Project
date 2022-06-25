package com.Constructor;

public class Cons_1 {

	public Cons_1() {

		System.out.println(" i am A class constructor");
	}

	public Cons_1(int x) {

		System.out.println("i am overloaded constructor of class A"+x);

	}
	
	public static void main(String[] args) {
		
	}

}

class Cons_2 extends Cons_1 {
	public Cons_2() {
		System.out.println("i am constructor of B");
	}

	public Cons_2(int y,int x) {
		super(x);
		System.out.println("i  am overload consrtctor of B "+y);

	}

}



class Main{
	
	
	public static void main(String[] args) {
		Cons_2 cc=new Cons_2(10, 5);
		
		
	}
	
	
}