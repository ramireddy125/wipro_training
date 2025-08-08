package com.day_13;
import java.sql.*;
import java.util.Scanner;


public class HspReg {

	public static void main(String[] args) throws SQLException {
		 Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","Venkat1122@");

			System.out.println("Data Base connected sucessfully");
			
            Statement stmt = con.createStatement();
			
			String sql="CREATE TABLE IF NOT EXISTS HOSPATIENT("+"id INT PRIMARY KEY AUTO_INCREMENT,"
			             +"name VARCHAR(100), "+"age INT,"+" disease VARCHAR(100), "+"AdmissionDate DATE, "+"Doctor VARCHAR(100))";
			
			stmt.executeUpdate(sql);
			System.out.println("Table HosPatient is created");
			
			while(true) {
				System.out.println("\n ---Hospital Patient Management---");
                System.out.println("1. Add Patient");
                System.out.println("2. Update Patient");
                System.out.println("3. Delete Patient");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                
                int ch  = sc.nextInt();
                sc.nextLine();
                
                switch(ch) {
                case 1:
                	System.out.println("Enter patient Name:");
        			String name = sc.nextLine();
        			System.out.println("Enter patient age:");
        			int age = sc.nextInt();
        			sc.nextLine();
        			System.out.println("Enter patient disease:");
        			String disease = sc.nextLine();
        			System.out.println("Enter patient appoitmentedate:");
        			String AdmissionDate = sc.nextLine();
        			System.out.println("Enter patient assigned doctor:");
        			String doctor = sc.nextLine();
        			
        			
        			
        			String insert = "INSERT INTO HOSPATIENT(name,age,disease, AdmissionDate, doctor) VALUES(?,?,?,?,?)";
        			
        			PreparedStatement pstmt = con.prepareStatement(insert);
        			
        			pstmt.setString(1,name);
        			pstmt.setInt(2,age);
        			pstmt.setString(3,disease);
        			pstmt.setString(4,AdmissionDate);
        			pstmt.setString(5,doctor);
        			
        			int re = pstmt.executeUpdate();
        			
        			System.out.println("Patients details inserted");
        			
        			break;
        			
                case 2:
                	System.out.println("Patients id to update");
                	int id = sc.nextInt();
                	sc.nextLine();
                	
                	System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    
                    System.out.print("Enter New Disease: ");
                    String newDisease = sc.nextLine();
                    
                    String update = "UPDATE HOSPATIENT SET name = ?, disease=? WHERE ID = ?";
                    
                    PreparedStatement pstmt1 = con.prepareStatement(update);
        			
        			pstmt1.setString(1,newName);
        			pstmt1.setString(2,newDisease);
        			pstmt1.setInt(3, id);
        			
        			int updated = pstmt1.executeUpdate();
        			
        			System.out.println("Patients details updated"+ updated);
        			
        			break;
        			
                case 3:
                	System.out.println("Patients id to Delete");
                	int did = sc.nextInt();
                	
                	String delete = "DELETE FROM HOSPATIENT WHERE id = ?";
                	PreparedStatement pstmt2 = con.prepareStatement(delete);
                	
                	pstmt2.setInt(1, did);
                	int deleted = pstmt2.executeUpdate();
                	System.out.println("Patients details deleted"+ deleted);
                	
        		
                case 4:
                	System.out.println("Exiting..");
                	break;
                	
                default :
                	System.out.println("Invalid choice");
                	
                }
                
            }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
