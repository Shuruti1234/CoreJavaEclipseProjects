package com.demo;

public class Addition {

	// method overloading on the basis number of arguments
	int add(int a, double b) {
		System.out.println("---- 2 number int addition-------");
		int sum = (int) (a + b);
		return sum;
	}

	// we cannot overload a method by changing the return type

//	float add(int a, int b) {
//		System.out.println("---- 2 number int addition-------");
//		float sum = a + b;
//		return sum;
//	}

	int add(int a, int b, int c) {
		System.out.println("---- 3 number addition-------");
		int sum = a + b + c;
		return sum;
	}

	// method overloading type of argumnets

	float add(float a, float b) {
		System.out.println("---- 2 number float addition-------");
		float sum = a + b;
		return sum;
	}

}
