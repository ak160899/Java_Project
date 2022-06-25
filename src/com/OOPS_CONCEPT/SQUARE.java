package com.OOPS_CONCEPT;

public class SQUARE {

	int side;

	private int area() {
		return side * side;
	}

	private int perimeter() {

		return side* 4;
	}

	public static void main(String[] args) {

		SQUARE s = new SQUARE();
		s.side=4;
		System.out.println(s.area()+"\n"+(s.perimeter()));
		
	}
}
