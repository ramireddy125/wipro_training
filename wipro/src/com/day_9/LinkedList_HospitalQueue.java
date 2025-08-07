package com.day_9;

import java.util.*;

class Patient {
    String id;
    String name;

    Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
    
}

public class LinkedList_HospitalQueue {
	 public static boolean isDuplicate(LinkedList<Patient> queue, String id) {
	        for (Patient p : queue) {
	            if (p.id.equals(id)) {
	                return true;
	            }
	        }
	        return false;
	    }
    public static void main(String[] args) {
        LinkedList<Patient> patientQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHospital Patient Queue Menu:");
            System.out.println("1. Add normal Patient ");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Remove First Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. View First and Last Patient");
            System.out.println("6. Cancel Appointment by ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    String id = sc.nextLine();
                    if (isDuplicate(patientQueue, id)) {
                        System.out.println("Patient ID already exists.");
                        break;
                    }
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    patientQueue.addLast(new Patient(id, name));
                    System.out.println("Patient added to normal queue.");
                    break;

                case 2:
                    System.out.print("Enter emergency patient ID: ");
                    String eid = sc.nextLine();
                    if (isDuplicate(patientQueue, eid)) {
                        System.out.println("Patient ID already exists.");
                        break;
                    }
                    System.out.print("Enter emergency patient name: ");
                    String ename = sc.nextLine();
                    patientQueue.addFirst(new Patient(eid, ename));
                    System.out.println("Emergency patient added to front of queue.");
                    break;

                case 3:
                    if (!patientQueue.isEmpty()) {
                        Patient removed = patientQueue.removeFirst();
                        System.out.println("Removed patient: " + removed);
                    } else {
                        System.out.println("No patients in the queue.");
                    }
                    break;

                case 4:
                    if (patientQueue.isEmpty()) {
                        System.out.println("No patients in queue.");
                    } else {
                        System.out.println("Current Patient Queue:");
                        for (Patient p : patientQueue) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    if (!patientQueue.isEmpty()) {
                        System.out.println("First: " + patientQueue.getFirst());
                        System.out.println("Last: " + patientQueue.getLast());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 6:
                	System.out.print("Enter patient ID to cancel: ");
                	String cancelId = sc.nextLine();

                	boolean removed = patientQueue.removeIf(p -> p.id.equalsIgnoreCase(cancelId));

                	if (removed) {
                	    System.out.println("Appointment cancelled for ID: " + cancelId);
                	} else {
                	    System.out.println("No patient found with ID: " + cancelId);
                	}

                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }

}
