package com.day_11;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Appointment {
    private String id;
    private String patientName;
    private String time;

    public Appointment(String id, String patientName, String time) {
        this.id = id;
        this.patientName = patientName;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + patientName + ", Time: " + time;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Appointment)) return false;
        Appointment other = (Appointment) obj;
        return id.equals(other.id);
    }

    public int hashCode() {
        return id.hashCode();
    }
}

public class TreeMap_Appointment {
    public static void main(String[] args) {
        TreeMap<String, Appointment> appointmentMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Appointment Scheduler Menu =====");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. Reschedule Appointment");
            System.out.println("5. Check Next and Last Appointments");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter Appointment ID: ");
                    String id = sc.nextLine().trim();
                    if (appointmentMap.containsKey(id)) {
                        System.out.println("Appointment with ID " + id + " already exists.");
                        break;
                    }
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine().trim();
                    System.out.print("Enter Appointment Time: ");
                    String time = sc.nextLine().trim();
                    appointmentMap.put(id, new Appointment(id, name, time));
                    System.out.println("Appointment Added.");
                    break;

                case 2: 
                    if (appointmentMap.isEmpty()) {
                        System.out.println("No appointments found.");
                    } else {
                        System.out.println("All Appointments:");
                        for (Map.Entry<String, Appointment> entry : appointmentMap.entrySet()) {
                            System.out.println(entry.getValue());
                        }
                    }
                    break;

                case 3: 
                    System.out.print("Enter ID to remove: ");
                    String removeId = sc.nextLine().trim();
                    Appointment removed = appointmentMap.remove(removeId);
                    System.out.println(removed != null ? "Removed: " + removed : " No appointment with ID " + removeId);
                    break;

                case 4: 
                    System.out.print("Enter ID to reschedule: ");
                    String rescheduleId = sc.nextLine().trim();
                    Appointment toUpdate = appointmentMap.get(rescheduleId);
                    if (toUpdate != null) {
                        System.out.print("Enter new time: ");
                        String newTime = sc.nextLine().trim();
                        toUpdate.setTime(newTime);
                        System.out.println(" Updated Appointment: " + toUpdate);
                    } else {
                        System.out.println(" No appointment with ID " + rescheduleId);
                    }
                    break;

                case 5: 
                    Map.Entry<String, Appointment> next = appointmentMap.firstEntry();
                    Map.Entry<String, Appointment> last = appointmentMap.lastEntry();
                    System.out.println("\n Next Appointment: " + (next != null ? next.getValue() : "None"));
                    System.out.println("\n Last Appointment: " + (last != null ? last.getValue() : "None"));
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Option.");
            }
        }
    }
}
