package com.practiceSet2;

public class Practiceset1 {

	private static void multiplication(int n) {
		int mul = 0;

		for (int i = 1; i <= 10; i++) {

			mul = n * i;
			System.out.printf("%dx%d=%d\n", n, i, n * i);

		}

	}

	public static void main(String[] args) {

		Practiceset1 p = new Practiceset1();
		multiplication(5);
		System.out.println();

	}
}
