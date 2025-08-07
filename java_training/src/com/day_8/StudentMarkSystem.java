package com.day_8;

import java.util.Scanner;

public class StudentMarkSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        Integer marks = Integer.parseInt(sc.nextLine()); 

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);


        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 35) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
