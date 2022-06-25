package com.day1;

public class Array_Reverse_Order {

	public static void main(String[] args) {
		
		//print the values of array in reverse order...
		
		int arr[]= {20,30,40,50,60};
		
		String name[]= {"akash","santhosh","sam","vick","prem"};		
		
		for(int i=arr.length-1;i>=0;i--) {
			
			
			System.out.println(arr[i]+name[i]);
		}
		
	}
	
}
