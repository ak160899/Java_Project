package com.practiceSet2;

public class Practice2 {
	// print the following pattern using functions...
	private static void Pattern(int n) {

		for (int row = 0; row < n; row++) {

			for (int col =0; col <=row; col++) {

				System.out.print("x"+" ");

			}
			System.out.println();

		}

	}
public static void main(String[] args) {
	
	Pattern(4);
}
}
