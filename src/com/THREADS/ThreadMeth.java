package com.THREADS;

public class ThreadMeth extends Thread {

	public ThreadMeth(String name) {
		super(name);

	}

	public void run() {
		int i = 1;
		while (i < 10) {
			System.out.println("good morning.."+this.getName());
			i++;
		}
	}

	public static void main(String[] args) {

	}
}

class Th1 extends Thread {
	public void run() {
		int i=1;
		while (i<10) {
			System.out.println("welcome home..");
			i++;
			
		}
	}

	public static void main(String[] args) {

		ThreadMeth t = new ThreadMeth("Akash");
		Th1 obj1 = new Th1();

		t.start();
		try{t.join();}catch(Exception w) {}
		obj1.start();

	}

}