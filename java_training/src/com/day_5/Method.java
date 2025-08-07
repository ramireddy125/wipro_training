package com.day_5;

public class Method {
	void hi() {
		System.out.println("hello venkat!");
	}

	static void hel() {
		System.out.println("hello");
	}

	static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Method.hel();
		Method x = new Method();
		x.hi();
		Method.add(10, 100);

	}
}
