package com.day_1_to_4;

public class StringBuffer_Ex {

	public static void main(String[] args) {
		StringBuffer profile = new StringBuffer();
		profile.append("Employee Profile Report \n");
        profile.append("iD : 12345 \n");
        profile.append("Name : Venkat Reddy \n");
        profile.append("Salary : 7,50,000 \n");
        profile.append("Department: IT \n");

        System.out.println("Original Employee Profile");
        System.out.println(profile.toString());
        
        profile.insert(0, "Joining Date: 01-July-2020 \n");
        System.out.println("\n After Insert");
        System.out.println(profile.toString());

        profile.reverse();
        System.out.println("\n After Reverse");
        System.out.println(profile.toString());
        
        
	}

}
