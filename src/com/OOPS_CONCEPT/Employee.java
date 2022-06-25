package com.OOPS_CONCEPT;

public class Employee {

	 String name;
	 int age;
	 int salary;
	
	private void printDetails() {
		System.out.println("the employee name is:"+name);
		System.out.println("the employee age is :"+age);

	}

	public int getSalary() {
		return salary;
	}
	
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		

		emp1.name = "welcome to vatsalya";
		emp1.age = 21;
		emp1.salary=15000;
		
		emp2.name = "Santhosh";
		emp2.age = 24;
		emp2.salary=12000;
		
		emp1.printDetails();
		emp2.printDetails();

		System.out.println(emp2.getSalary());

	}
}
