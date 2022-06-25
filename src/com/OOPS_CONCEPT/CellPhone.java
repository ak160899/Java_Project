package com.OOPS_CONCEPT;

public class CellPhone {

	// ringing and vibrating methods..

	private String call(String name) {
		return name;

	}

	private String ring(String vib) {
		return vib;

	}

	private String vib(String vibr) {
		return vibr;

	}

	public static void main(String[] args) {

		CellPhone c = new CellPhone();
		System.out.print(c.call("santhosh calling......\n") + (c.ring("ringing.....\n") + (c.vib("vibrating.....\n"))));

	}

}
