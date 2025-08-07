package wipro;

class Inherit_Employee {
	String name;
    double salary;
    
    Inherit_Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void work() {
        System.out.println(name + " works with salary: " + salary);
    }
}

class Manager extends Inherit_Employee {
    Manager(String name, double salary)
    {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is managing the team.");
    }
}


class Developer extends Inherit_Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
    void work() {
        System.out.println(name + " is coding.");
    }
}


