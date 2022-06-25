package com.recrussion;

import java.util.Scanner;

public class RecrusionExercise {
	static int a = 0, b = 1, c = 0;

	private static void fibonci(int input) {
		if (input > 0) {
			System.out.print(a +"\t");
			c = a + b;
			a = b;
			b = c;

			fibonci(input - 1);
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		fibonci(input);
	}
}
