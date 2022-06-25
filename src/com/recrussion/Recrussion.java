package com.recrussion;

public class Recrussion {

	// find the sym off 1,2,3....n using recrusion...

	static int sum(int n) {

		if (n == 1) {
			return 1;

		}

		return n*sum(n - 1);

	}

	public static void main(String[] args) {
		Recrussion r = new Recrussion();
		int c = sum(4);
System.out.println(c);
	}

}
