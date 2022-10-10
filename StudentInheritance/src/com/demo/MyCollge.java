package com.demo;

import java.util.Scanner;

public class MyCollge {
	static CollegeStudent s;

	static void enterCollegeStudent() {

		Scanner sc1 = new Scanner(System.in);
		s = new CollegeStudent();

		float m[] = new float[5];
		System.out.println("Enter the collge ID:");
		s.setId(sc1.nextInt());
		System.out.println("Enter the college name:");
		s.setName(sc1.next());
		System.out.println("Enter the student age:");
		s.setAge(sc1.nextInt());
		System.out.println("Enter the course:");
		s.setCourse(sc1.next());
		System.out.println("Enter the semester:");
		s.setSemester(sc1.nextInt());

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the marks of subject" + (i + 1) + ":");
			m[i] = sc1.nextFloat();
		}
		s.setMarks(m);

		// calculating the sum of marks
		double percentage = s.calcPercentage(m);
		s.setDivision(percentage);
		System.out.println();
		System.out.println();
		System.out.println("Student Grade Card:");
		displayCollegeStudent();

		sc1.close();

	}

	static void displayCollegeStudent() {

		System.out.println("ID:" + s.getId());
		System.out.println("Name:" + s.getName());
		System.out.println("Course:" + s.getCourse());
		System.out.println("semester:" + s.getSemester());
		System.out.println("Division:" + s.getDivision());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the college student details:");

		enterCollegeStudent();

	}

}
