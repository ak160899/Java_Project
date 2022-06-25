package com.Constructor;

public class __Constructor__ {

	String name;
	int age;

	public __Constructor__(String mn, int ma) {
		System.out.println(name = mn);
		System.out.println(age = ma);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		__Constructor__ c = new __Constructor__("santhosh", 24);

		c.setAge(21);
		c.setName("Akash");

		System.out.println(c.name + "\n" + (c.age));

	}
}
