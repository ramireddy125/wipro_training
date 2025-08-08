package com.day_1_to_4;

abstract class Shape {
	abstract double area();
}
class Circle extends Shape{
	double radius;
	
	Circle(double radius)
	{
        this.radius = radius;
    }
	double area() 
	{
        return Math.PI* radius * radius;
    }
}