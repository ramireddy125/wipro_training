package com.day_10;
import java.util.*;

class Doctor {
    private String licenseNumber;
    private String name;
    private String department;

    Doctor(String licenseNumber, String name, String department) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.department = department;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) {
        	return false;
        }else {
        Doctor d = (Doctor) o;
        return this.licenseNumber.equalsIgnoreCase(d.licenseNumber);
        }
    }

    public int hashCode() {
        return licenseNumber.toLowerCase().hashCode();
    }

    public String toString() {
        return "Doctor [License=" + licenseNumber + ", Name=" + name + ", Dept=" + department + "]";
    }
}

public class Doctor_HashSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Doctor> doctorset = new HashSet<>();
		
		while(true) {
			System.out.println("\n Doctor Management");
            System.out.println("1. Add Doctor");
            System.out.println("2. Display All Doctors");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            
            switch(ch){
            case 1 :
            	System.out.print("Enter License Number: ");
            	String licenseNo= sc.nextLine();
            	
            	System.out.print("Enter Name: ");
            	String name = sc.nextLine();
            	
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                
                Doctor d = new Doctor(licenseNo, name, dept);
                
                if (doctorset.add(d)) {
                    System.out.println("Doctor added.");
                } else {
                    System.out.println("Doctor with this number already exists.");
                }
                break;
                
            case 2:
            	if (doctorset.isEmpty()) {
                    System.out.println("No doctors registered yet.");
                } else {
                    System.out.println("List of Registered Doctors:");
                    for (Doctor doc : doctorset) {
                        System.out.println(doc);
                    }
                }
                break;
                
            case 3:
                System.out.println("Exiting....");
                sc.close();
                return;
                
            default:
                System.out.println("Invalid choice..");
                
                sc.close();
            }
		}

	}

}
