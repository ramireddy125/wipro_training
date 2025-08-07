package wipro;

import java.util.Scanner;

public class Encapsulation {
	
	
	public static void main(String[] args) {
//		Encasp_usecase u1 = new Encasp_usecase();
//		u1.setSalary(50000);
//		System.out.println(u1.getSalary());
//		
//		
//		enc_bank u2 = new enc_bank();
//		u2.deposit(1000);
//		System.out.println("Balance: " + u2.getBalance());
//		u2.withdraw(500);
//		System.out.println("Balance: " + u2.getBalance());
//		u2.withdraw(1000);
//		
//		
//		
//		Enc_Car c=new Enc_Car();
//		c.startEngine();
//		c.refuel(20);
//		c.setSpeed(60);
//		System.out.println("car speed is: " + c.getSpeed() + " km/h");
//		System.out.println("Fuel level: " + c.getFuelLevel() + " L");
//		c.stopEngine();
//		System.out.println("Car stopped. Current speed: " + c.getSpeed() + " km/h");
//		
//		
//		
//		Enc_Patient u3= new Enc_Patient();
//		u3.setName("venkat");
//		System.out.println("Patient Name: " + u3.getName());
//		u3.setAge(25);
//		System.out.println("Age: " + u3.getAge());
//		u3.setHealthInfo("health is good");
//		System.out.println("Health Info: " + u3.getHealthInfo());
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter your Voter ID: ");
//		String voterId = scanner.nextLine();
//
//		Enc_vote voter = new Enc_vote();
//		voter.setVoterId(voterId);
//		
//		
//		VoterService service = new VoterService();
//		service.processVoting(voter);
//		scanner.close();
		
		
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		StudentDetails info = new StudentDetails();
		
		System.out.print("Enter student name: ");
		student.setName(sc.nextLine());
		System.out.print("Enter roll number: ");
		student.setRollNo(sc.nextInt());
		System.out.print("Enter marks: ");
		student.setMarks(sc.nextDouble());
		info.StudentInfo(student);
		sc.close();
		
	}

}
