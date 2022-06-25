package com.practiceSet2;

public class PracticeSet3 {
	
	private static int sumOfNatural(int n) {
	
		if(n==10||n==11) {
			
			return 10;
		}
		return n+sumOfNatural(n+1);
	}

	public static void main(String[] args) {
		

	int nat=sumOfNatural(1);
		System.out.println(nat);
		
	}
	
}
