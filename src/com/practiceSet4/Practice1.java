package com.practiceSet4;

public class Practice1 {

	private static void Pattern(int n) {
		if(n>3) {
                Pattern(n-1);
		for (int i = 0; i<n; i++) {

			System.out.print("x" + " ");
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Pattern(5);
		
	}
}
