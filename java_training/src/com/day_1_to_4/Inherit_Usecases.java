package com.day_1_to_4;

public class Inherit_Usecases {

	public static void main(String[] args) {
		System.out.println("Employees:");
		Inherit_Employee emp1 = new Manager("venkat", 80000);
        Inherit_Employee emp2 = new Developer("ram", 70000);

        emp1.work();  
        emp2.work();  

        Inherit_Employee emp3 = new Inherit_Employee("Generic Employee", 50000);
        emp3.work();

	}

}
