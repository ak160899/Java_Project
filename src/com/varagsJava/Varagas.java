package com.varagsJava;

public class Varagas {

	// varags stand for variable lenght arguments...

	static int sum(int x, int... i) {

		int su = x;
		for (int elem : i) {

			su += elem;
		}
		return su;
	}

	public static void main(String[] args) {
		
	
		Varagas v=new Varagas();
		System.out.println(v.sum(1,2,3,4,5,6,6,7));
        System.out.println(sum(9, 8,9));
	}

}
