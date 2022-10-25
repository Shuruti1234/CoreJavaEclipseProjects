package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> myclass = new ArrayList<>();
		myclass.add(new Student(101, "Prithwish", 23));
		myclass.add(new Student(102, "Sweta", 25));
		myclass.add(new Student(103, "Payal", 21));
		myclass.add(new Student(104, "Royston", 26));
		myclass.add(new Student(105, "Sonu", 20));

		Collections.sort(myclass);

		for (Student s : myclass) {
			System.out.println(s);
		}

	}

}
