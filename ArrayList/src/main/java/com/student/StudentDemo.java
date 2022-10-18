package com.student;

import java.util.ArrayList;

public class StudentDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Student s1 = new Student(101, "Prithwish", 89.7f);
		System.out.println(s1);

		ArrayList<Student> myclass = new ArrayList<>();
		myclass.add(new Student(101, "Prithwish", 89.7f));
		myclass.add(new Student(102, "Sweta", 79.7f));
		myclass.add(new Student(103, "Payal", 80.7f));
		myclass.add(new Student(104, "Royston", 94.7f));
		myclass.add(new Student(105, "Sonu", 91.7f));

		for (Student s : myclass) {
			// System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks());
			System.out.println(s);
		}

	}

}
