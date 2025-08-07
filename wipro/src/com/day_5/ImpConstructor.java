package com.day_5;

class Person 
{
    String name;

    Person(String name) 
    {
        this.name = name; 
    }
}

class Emp extends Person 
{
    double salary;

    Emp(String name, double salary) 
    {
        super(name);       
        this.salary = salary;  
    }
    Emp(Emp e)
    {
        super(e.name);        
        this.salary = e.salary;
    }
    Emp() 
    {
        super("Default");   
        this.salary = 0.0; 
    }

    void display() 
    {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class ImpConstructor {
    public static void main(String[] args) {
        Emp emp1 = new Emp("Venkat", 40000);
        Emp emp2 = new Emp(emp1);
        Emp emp3 = new Emp();

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
