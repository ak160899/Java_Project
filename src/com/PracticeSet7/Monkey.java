package com.PracticeSet7;

public class Monkey {
	
	public void jump() {
		System.out.println("jumping...");

	}
public void bite() {
	System.out.println("biting...");
}
	public static void main(String[] args) {
		
	}
}
class Human extends Monkey implements BasicAnimal{

	@Override
	public void eat() {
		System.out.println("eating...");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping...");
		
	}
	
	
}

interface BasicAnimal{
	void eat();
	void sleep();
}

class run{
	
	public static void main(String[] args) {
		
		Human obj=new Human();
		obj.bite();
		obj.eat();
		obj.jump();
		obj.sleep();
		
	}
}

