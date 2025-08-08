package com.day_1_to_4;
import java.util.Scanner;

public class Jagged_array 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter number of students: ");
	        int numStudents = sc.nextInt();
	        sc.nextLine(); 

	        String[] students = new String[numStudents];
	        String[][] subjects = new String[numStudents][];

	        for (int i = 0; i < numStudents; i++) {
	            System.out.print("Enter name of student " + (i + 1) + ": ");
	            students[i] = sc.nextLine();

	            System.out.print("How many subjects for " + students[i] + "? ");
	            int numSubjects = sc.nextInt();
	            sc.nextLine(); 

	            subjects[i] = new String[numSubjects];
	            for (int j = 0; j < numSubjects; j++) {
	                System.out.print("Enter subject " + (j + 1) + students[i] + ": ");
	                subjects[i][j] = sc.nextLine();
	            }
	        }
	       
	      
	        for (int i = 0; i < numStudents; i++) 
	        {
	            System.out.println(students[i] + "subjects:");
	            for (int j = 0; j < subjects[i].length; j++) {
	                System.out.println(" - " + subjects[i][j]);
	            }
	            System.out.println();
	        }

	        sc.close();



 
	}
}


