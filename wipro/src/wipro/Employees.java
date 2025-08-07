package wipro;

public class Employees {
	 int id;
	 String name;
	 String department;
	 double salary;

	 void setDetails(int empId, String empName, String dept, double empSalary) 
	 {
	     id = empId;
	     name = empName;
	     department = dept;
	     salary = empSalary;
	  }
	 void displayDetails() 
	 {
	      System.out.println("id: " + id);
	      System.out.println("Name: " + name);
	      System.out.println("Department: " + department);
	      System.out.println("Salary: ₹" + salary);
	  }
	 

	public static void main(String[] args) {
		Employees x = new Employees();
		x.setDetails(1, "venkat", "it", 60000);
		x.displayDetails();
		
	}

}
