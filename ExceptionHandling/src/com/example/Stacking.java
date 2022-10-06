package com.example;

public class Stacking {

	static void method1() {
		try {
			System.out.println("In method 1");
			method2();
		}

		catch (Exception e) {
			System.out.println("Divide by zero is not possible");
		}
	}

	static void method2() {

		System.out.println("In method 2");
		method3();
		System.out.println("Hi");
	}

	static void method3() {

		int a = 20;
		int b = 0;
		int d = a / b;
		System.out.println(d);
		System.out.println("In method 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
	}

}
