package com.healthcare.model;

import java.util.Scanner;

public class MianClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Doctor generalDoc = new GeneralPhysician("Reddy");
        Doctor cardioDoc = new Cardiologist("Venkay");

        PatientServiceImpl service = new PatientServiceImpl();

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Illness: ");
        String illness = sc.nextLine();

        Patient p = new Patient(id, name, age, illness);

        service.registerPatient(p);

        System.out.println("\n--- Diagnosis ---");
        if (illness.toLowerCase().contains("heart")) {
            cardioDoc.diagnose(p);
        } else {
            generalDoc.diagnose(p);
        }

        System.out.println("\n--- Patient Details ---");
        service.showPatientDetails(id);

        sc.close();
    }
}
