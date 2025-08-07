package com.day_8;
import java.util.Scanner;

class Student{
	String Name;
	int age;
	double marks;
	
	Student(String nameInput, String ageInput, String marksInput) {
		Name = nameInput;
		age = Integer.parseInt(ageInput);      
		marks = Double.parseDouble(marksInput); 
	}
	 void display() {
	        System.out.println("\n--- Student Details ---");
	        System.out.println("Name  : " + Name);
	        System.out.println("Age   : " + age);
	        System.out.println("Marks : " + marks);
	    }
}



public class FormValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
        String Name = sc.nextLine();

        System.out.print("Enter age: ");
        String age = sc.nextLine();

        System.out.print("Enter marks: ");
        String marks = sc.nextLine();
		
        Student student = new Student(Name, age, marks);
        student.display();

        sc.close();


	}

}
