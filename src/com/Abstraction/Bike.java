package com.Abstraction;

public interface Bike {
 public int s=100;
	void applyGear();

	void applyBrake();
	public static void main(String[] args) {
		
	}

}
 interface spd{
	 
	 void speed();
	 
	 
 }
class Yamaha implements Bike, spd{
 
	public int s=99;
	@Override
	public void applyBrake() {
		System.out.println("applying brake to the  yamaha  bike...");

	}

	@Override
	public void applyGear() {
		System.out.println("applying gear to the yamaha bike....");
	}
@Override
public void speed() {
	System.out.println("speed of the yamaha is 150cc...");
	
}
	public static void main(String[] args) {
		
	}
}

class Honda implements Bike,spd{

	@Override
	public void applyBrake() {
		System.out.println("appling brake  to the honda bike ");

	}

	@Override
	public void applyGear() {
		System.out.println("apply gear to the honda bike...");

	}
	@Override
	public void speed() {
		System.out.println("speed of the honda is 80cc...");
		
	}
}

class ob {

	public static void main(String[] args) {
     
	
		Bike obj=new Yamaha();
		obj.applyBrake();
		obj.applyGear();
		System.out.println();
		 
		Yamaha y=new Yamaha();
		y.speed();
		System.out.println(y.s);
		
		
		Bike obj1=new Honda();
		obj1.applyBrake();
		obj1.applyGear();
		
	}

}