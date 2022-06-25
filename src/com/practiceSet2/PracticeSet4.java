package com.practiceSet2;

public class PracticeSet4 {
	
	private static void pattern2(int n) {
		
		for(int i=n;i>0;i--) {
			
			for(int j=i;j>0;j--) {
				
				System.out.print("x"+" ");
			}
			System.out.print("\n");
		}
		

	}
public static void main(String[] args) {
	pattern2(5);
	
	int i=0;
	i++;
	System.out.println(i);
}
}
