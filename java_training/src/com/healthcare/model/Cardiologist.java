package com.healthcare.model;

public class Cardiologist extends Doctor {

    public Cardiologist(String name) {
        super(name, "Cardiologist");
    }
    public void diagnose(Patient patient) {
        System.out.println(name +"Cardiologist diagnosing:"+ patient.getName());
        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Specialized heart treatment for: " + patient.getIllness());
        } else {
            System.out.println("Redirecting patient to appropriate specialist.");
        }
    }
}