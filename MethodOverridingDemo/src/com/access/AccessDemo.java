package com.access;

public class AccessDemo {

	public static final float pi = 3.14f;// global constant

	private String name;

	protected String course;

	public static void main(String[] args) {

		AccessDemo a = new AccessDemo();
		// a.num = 7; // public are accessible within the class, outside the class,
		// outside the
		// package
		// System.out.println(a.pi);
		a.name = "Shuruti";// private are accessible within the class
		a.course = "BCA";

	}

}
