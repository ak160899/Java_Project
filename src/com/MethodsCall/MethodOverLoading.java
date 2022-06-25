package com.MethodsCall;

public class MethodOverLoading {

	static void sum(int ar[]) {
      
		ar[0]=90;
		ar[2]=80;

	}
	
	public static void main(String[] args) {
		
	int ar[]= {10,30,20,40};
	sum(ar);
		
		for (int elem : ar) {
			System.out.println(elem);
			
		}
	}

}
