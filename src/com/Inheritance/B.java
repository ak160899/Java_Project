package com.Inheritance;

public class B extends A {

	int age;

	public int setAge(int Sage) {

		this.age = Sage;
		return Sage;
	}

	public static void main(String[] args) {

		A class1 = new A();
		class1.setName("Akash");
		System.out.println(class1.getName());
		
		B class2=new B();
		class2.setName("santhosh");
		System.out.println();

	}

}
