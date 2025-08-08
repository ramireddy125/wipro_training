package com.day_10;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Appointment {
    private String name;
    private LocalDateTime dateTime;

    public Appointment(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "Name: " + name + ", DateTime: " + dateTime.format(formatter);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Appointment)) return false;
        Appointment a = (Appointment) obj;
        return this.name.equalsIgnoreCase(a.name) && this.dateTime.equals(a.dateTime);
    }

    public int hashCode() {
        return Objects.hash(name.toLowerCase(), dateTime);
    }
}

public class TreeSet_Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        TreeSet<Appointment> appointments = new TreeSet<>(Comparator.comparing(Appointment::getDateTime));

        int choice;
        do {
            System.out.println("\n1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Date and Time (yyyy-MM-dd HH:mm): ");
                    String dateTimeStr = sc.nextLine();

                    LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
                    Appointment newAppt = new Appointment(name, dateTime);

                    if (appointments.contains(newAppt)) {
                        System.out.println("Appointment already exists.");
                    } else {
                        appointments.add(newAppt);
                        System.out.println("Appointment added.");
                    }
                    break;

                case 2:
                    System.out.println("\nAll Scheduled Appointments:");
                    for (Appointment a : appointments) {
                        System.out.println(a);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
