package com.day_11;
import java.util.Map;
import java.util.TreeMap;


class Patient {
    private String id;
    private String name;
    private String disease;

    public Patient(String id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Disease: " + disease;
    }
}

public class TreeMap_Ex {

    public static void main(String[] args) {
        TreeMap<String, Patient> patientMap = new TreeMap<>();

        patientMap.put("P101", new Patient("P101", "Venkat", "Fever"));
        patientMap.put("P102", new Patient("P102", "Ravi", "Cold"));
        patientMap.put("P104", new Patient("P104", "ram", "Diabetes"));
        patientMap.put("P103", new Patient("P103", "reddy", "Malaria"));
        patientMap.put("P106", new Patient("P105", "reddy", "Malaria"));
        

        System.out.println("\nAll Patient Entries:");
        for (Map.Entry<String, Patient> p : patientMap.entrySet()) {
            System.out.println(p);
        }
        
        System.out.println("\n first patient id:" + patientMap.firstKey());
        
        System.out.println("\n last patient id:" + patientMap.lastKey());

//        System.out.println("\n  patient id:" + patientMap.));
    }
}
