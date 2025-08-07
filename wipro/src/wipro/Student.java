package wipro;

public class Student {
	private String name;
    private int rollNo;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }
}

class StudentDetails {
    public void StudentInfo(Student student) 
    {
        System.out.println("Name:" + student.getName());
        System.out.println("Roll No:" + student.getRollNo());
        System.out.println("Marks: " + student.getMarks());
    }
}


