package com.OOPS_CONCEPT;

public class Employees {

	String name;
	int salary;


	public int getSalary() {
		return salary;
	}
	
	private String getname() {
		return name;
	}

	public void setName(String cname) {

		name = cname;

	}

	public static void main(String[] args) {

		Employees akash = new Employees();
    
		
		akash.name = "akash";
		akash.salary = 25000;
		akash.setName("santhosh");

		System.out.println(akash.getname());
		System.out.println(akash.getSalary());

	}

}
