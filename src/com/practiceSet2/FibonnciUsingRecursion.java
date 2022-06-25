package com.practiceSet2;

public class FibonnciUsingRecursion {
//0 1 1 2 3 5 8

	private static int fibbonnci(int n) {

		if (n == 1 || n == 2) {
			return 1;
		} else {

			return fibbonnci(n - 1) + fibbonnci(n - 2);
		}
	}

	public static void main(String[] args) {

		int c = fibbonnci(3);
		System.out.println(c);

	}
}
