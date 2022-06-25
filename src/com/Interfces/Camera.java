package com.Interfces;

public interface Camera {

	void takeSnap();

	private void videoRecoder4k() {
		System.out.println("recording 4k video...");
	}

	default void AcessMeth() {
		videoRecoder4k();
	}

	public static void main(String[] args) {

	}
}

interface wifi {

	String[] getNetworks();

	void connectToNetwork(String network);

}

class mySmartPhone implements Camera, wifi {
	/*
	 * public void videoRecoder4k() {
	 * System.out.println("taking snap and recoding 4k video..."); }
	 */
	@Override
	public void takeSnap() {
		// videoRecoder4k();
		System.out.println("taking snap....");
	}

	@Override
	public String[] getNetworks() {
		System.out.println("list of networks...");

		String[] getNetworks = { "airetl", "Jio", "Act", "Vodaphone" };
		for (String elem : getNetworks) {
			System.out.println(elem);
		}
		return getNetworks;
	}

	@Override
	public void connectToNetwork(String network) {
		System.out.println("connecting to netwoks.." + network);

	}

}

class Mian {

	public static void main(String[] args) {

		mySmartPhone obj = new mySmartPhone();
		obj.getNetworks();
		obj.connectToNetwork("Act");
		obj.takeSnap();
		obj.AcessMeth();

	}

}