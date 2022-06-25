package com.THREADS;

class A {

	public void meth1() {
		System.out.println("hello hoe are you...");
	}

}

public class MyThread extends A implements Runnable {

	public void hello() {
		int i = 0;
		while (i < 10) {

			System.out.println("i am ready to race...");
			i++;
		}
	}

	public static void main(String[] args) {

	}

	@Override
	public void run() {
		hello();
		
	}
}

class Mythread2 extends A implements Runnable {

	public void hi() {

		int i = 0;
		while (i < 10) {
			System.out.println("Lets goooo boom boom...");
			i++;
		}
	}

	@Override
	public void run() {
		hi();
		
	}

}

class Main {
	public static void main(String[] args) {

		MyThread obj = new MyThread();

		Mythread2 obj2 = new Mythread2();

		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj2);
		t.start();
		try{Thread.sleep(50);}catch(Exception e) {}
		t1.start();

	}
}
 