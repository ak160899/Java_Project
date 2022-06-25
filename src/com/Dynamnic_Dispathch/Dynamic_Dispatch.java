package com.Dynamnic_Dispathch;

import com.Inheritance.B;

public class Dynamic_Dispatch {

	public void meth1() {
		System.out.println("welcome to class 1");

	}

	public void meth2() {
		System.out.println("this is java class.... a method");

	}

	public static void main(String[] args) {

	}
}

class b extends Dynamic_Dispatch {

	public void meth2() {

		System.out.println("this is class b methods");

	}

	public void meth3() {
		System.out.println("closing methid of 3");

	}

}

class c {

	public static void main(String[] args) {
		/*
		 * Dynamic_Dispatch obj=new Dynamic_Dispatch();//allowed obj.meth1();
		 * obj.meth2();
		 */
		/*
		 * b obj =new b(); obj.meth1(); obj.meth2(); obj.meth3();
		 */

		Dynamic_Dispatch obj = new b();
		obj.meth1();
		obj.meth2();
	}

}