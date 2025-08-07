package com.healthcare.model;

public class PatientServiceImpl implements PatientService {

    private Patient[] patients = new Patient[100]; 
    private int count = 0;

    public void registerPatient(Patient patient) {
        if (count < patients.length) {
            patients[count] = patient;
            System.out.println("Patient registered: " + patient.getName());
            count++;
        } else {
            System.out.println("Patient list is full. Cannot register more.");
        }
    }
    public void showPatientDetails(int id) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (patients[i].getId() == id) {
            	 System.out.println("Patient Details:");
                 System.out.println("ID:"+ patients[i].getId());
                 System.out.println("Name:"+ patients[i].getName());
                 System.out.println("Age:"+ patients[i].getAge());
                 System.out.println("Illness:"+ patients[i].getIllness());
                 found = true;
                 break;
            }
        }

        if (!found) {
            System.out.println("Patient not found with ID: " + id);
        }
    }
}
