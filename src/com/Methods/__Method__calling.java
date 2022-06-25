package com.Methods;

public class __Method__calling {

	static int logic(int x, int y) {
		int z;
		z = x * y;
		
		x=12;
		return z;

	}

	public static void main(String[] args) {
		__Method__calling m = new __Method__calling();

		int a = 10;
		int b = 20;
		int c = m.logic(a, b);
		System.out.println(c);
	}

}
