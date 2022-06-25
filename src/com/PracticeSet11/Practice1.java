package com.PracticeSet11;

public class Practice1 extends Thread {

	public void run() {
		int i = 1;
		while (i < 10) {
			System.out.println("good moning...");
			i++;
		}

	}

	public static void main(String[] args) {

	}
}

class Th2 extends Thread {

	public void run() {
		int i = 1;
		while (i < 10) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}

			System.out.println("welcome");
			i++;

		}
	}
}

class Th3 {
	public static void main(String[] args) {

		Practice1 obj = new Practice1();
		Th2 obj2 = new Th2();
		//obj.start();
		//obj2.start();
		//obj2.setPriority(5);
		// System.out.println(obj.getPriority());
		System.out.println(obj.getState());
		System.out.println(Thread.currentThread().getState());
		// System.out.println(obj2.);

	}
}