package com.Abstraction;

public abstract class Ab1 {
	
	int a=45;
	public abstract void meth1();
	
	public void meth2() {
		System.out.println("welcome to programming");

	}
public static void main(String[] args) {
	
}
}

class ab2 extends Ab1{

	@Override
	public void meth1() {
	System.out.println("good morning..");
		
	}
	
	
}

class ab3{
	
	public static void main(String[] args) {
		
	
	Ab1 obj=new ab2();
	obj.meth1();
	
	//ab2 obj1=new ab2();
	
	}
}