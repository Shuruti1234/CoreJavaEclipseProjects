package com.demo;

import java.util.Scanner;

public class ABCSchool {
	static SchoolStudent s;

	static void enterSchoolStudent() {

		Scanner sc1 = new Scanner(System.in);
		s = new SchoolStudent();

		float m[] = new float[3];
		System.out.println("Enter the student ID:");
		s.setId(sc1.nextInt());
		System.out.println("Enter the student name:");
		s.setName(sc1.next());
		System.out.println("Enter the student age:");
		s.setAge(sc1.nextInt());
		System.out.println("Enter the student class:");
		s.setStandard(sc1.next());

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the marks of subject" + (i + 1) + ":");
			m[i] = sc1.nextFloat();
		}
		s.setMarks(m);

		// calculating the sum of marks
		s.setPercentage(s.calcPercentage(m));
		System.out.println();
		System.out.println();
		System.out.println("Student Grade Card:");
		displaySchoolStudent();

		sc1.close();

	}

	static void displaySchoolStudent() {

		System.out.println("ID:" + s.getId());
		System.out.println("Name:" + s.getName());
		System.out.println("Class:" + s.getStandard());
		System.out.println("Percentage:" + s.getPercentage() + "%");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the school student details:");

		enterSchoolStudent();

	}

}
