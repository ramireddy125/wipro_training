package com.Lambda;
import com.Day_4.Lambda;

public class Main {

	public static void main(String[] args) {
		Lambda add = (a,b)-> a+b;
		Lambda sub = (a, b) -> a - b;
		Lambda mul = (a, b) -> a * b;
		Lambda div = (a, b) -> b == 0 ? 0: a / b;

        double x=20, y=5;
        
        System.out.println("Addition: " + add.nums(x, y));
        System.out.println("Subtraction: " + sub.nums(x, y));
        System.out.println("Multiplication: " + mul.nums(x, y));
        System.out.println("Division: " + div.nums(x, y));
	}

}
