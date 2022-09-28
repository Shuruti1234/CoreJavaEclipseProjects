package com.access;

public class Demo {

	public static void main(String[] args) {
		AccessDemo a2 = new AccessDemo();

		System.out.println(AccessDemo.pi);
		// a2.name="ABC"; private not accessible outside the class

		a2.course = "MCA";

		// TestConstructor t2= new TestConstructor(7);

	}
}
