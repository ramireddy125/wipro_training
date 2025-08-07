package com.day_5;
import java.util.Scanner;

import java.util.Arrays;

class Employee {

	String name;
	double Salary;
	
	Employee(String name, double Salary){
		this.name=name;
		this.Salary=Salary;
	}
	
	
}
public class Sorting{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 
            
            employees[i] = new Employee(name, salary);
        }
        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.Salary, e2.Salary));

        System.out.println("\nEmployees sorted by salary:");
        for (Employee e : employees) {
            System.out.println("Name: " + e.name + ", Salary: " + e.Salary);
        }

        scanner.close();
	}
}
