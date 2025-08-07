package com.healthcare.model;

public class GeneralPhysician extends Doctor {

    public GeneralPhysician(String name) {
        super(name, "General Physician");
    }

    public void diagnose(Patient patient) {
        System.out.println(name + "General diagnosing:" + patient.getName());
        System.out.println("Basic diagnosis for illness: " + patient.getIllness());
    }
}