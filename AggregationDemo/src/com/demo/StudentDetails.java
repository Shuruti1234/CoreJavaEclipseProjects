package com.demo;

public class StudentDetails {

	static void display(Student s) {
//		System.out.println("Student Id:" + s.getId());
//		System.out.println("Student Name:" + s.getName());
//		System.out.println("Address:" + s.getAddr());

		System.out.println(s);

	}

	public static void main(String[] args) {

		Student s1 = new Student(11, "Mitul", new Address("AG 44", "Mumbai", 450089, "Maharashtra", "India"));

		System.out.println("Details are:");

		display(s1);

	}

}
