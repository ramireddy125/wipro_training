package com.day_8;
import java.util.*;

class Patient {
    String name;
    String disease;

    Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    public String toString() {
        return "Name: " + name + ", Disease: " + disease;
    }
}

public class ArrayList_HospitalOPD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("\n----- Patient Management Menu -----");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Find First/Last Index of a Patient");
            System.out.println("11. Check if List is Empty");
            System.out.println("12. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();
                    patients.add(new Patient(name, disease));
                    System.out.println("Patient added.");
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients found.");
                    } else {
                        for (Patient p : patients)
                            System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < patients.size()) {
                        System.out.println(patients.get(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to update disease: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    if (idx >= 0 && idx < patients.size()) {
                        System.out.print("Enter new disease: ");
                        String newDisease = sc.nextLine();
                        patients.get(idx).disease = newDisease;
                        System.out.println("Disease updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = sc.nextInt();
                    if (removeIndex >= 0 && removeIndex < patients.size()) {
                        patients.remove(removeIndex);
                        System.out.println("Patient removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.print("Enter name to remove: ");
                    String removeName = sc.nextLine();
                    boolean removed = false;
                    Iterator<Patient> it = patients.iterator();
                    while (it.hasNext()) {
                        if (it.next().name.equalsIgnoreCase(removeName)) {
                            it.remove();
                            removed = true;
                        }
                    }
                    System.out.println(removed ? "Patient(s) removed." : "Patient not found.");
                    break;

                case 7:
                    System.out.print("Enter name to check: ");
                    String checkName = sc.nextLine();
                    boolean found = false;
                    for (Patient p : patients) {
                        if (p.name.equalsIgnoreCase(checkName)) {
                            found = true;
                            break;
                        }
                    }
                    System.out.println(found ? "Patient exists." : "Patient not found.");
                    break;

                case 8:
                    System.out.println("Total patients: " + patients.size());
                    break;

                case 9:
                    patients.clear();
                    System.out.println("All records cleared.");
                    break;

                case 10:
                    System.out.print("Enter name to find index: ");
                    String searchName = sc.nextLine();
                    int first = -1, last = -1;
                    for (int i = 0; i < patients.size(); i++) {
                        if (patients.get(i).name.equalsIgnoreCase(searchName)) {
                            if (first == -1) first = i;
                            last = i;
                        }
                    }
                    if (first != -1) {
                        System.out.println("First index: " + first + ", Last index: " + last);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 11:
                    System.out.println(patients.isEmpty() ? "List is empty." : "List is not empty.");
                    break;

                case 12:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
