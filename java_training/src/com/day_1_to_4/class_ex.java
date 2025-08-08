package com.day_1_to_4;

public class class_ex {
	String color;
	String model;
	int speed;
	
	void start() 
	{
		System.out.println("car is stareted");
	}
	
	void greet(String name) 
	{
		System.out.println("Hi"+name);
	}
	int getluckyno() 
	{
		return 10;
	}
	int add(int a,int b) 
	{
		return a+b;
	}

	void displayinfo() {
		System.out.println("color : "+color);
		System.out.println("model : "+model);
		System.out.println("speed : "+speed);
	}
	public static void main(String[] args) {
		
		class_ex x=new class_ex();
		x.color="Black";
		x.model="Thor";
		x.speed=120;
		x.start();
		x.displayinfo();
		x.greet("ram");
		x.getluckyno();
		x.add(10, 100);
	}

}
