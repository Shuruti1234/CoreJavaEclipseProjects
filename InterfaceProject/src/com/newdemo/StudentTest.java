package com.newdemo;

public class StudentTest implements Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Course:" + course);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StudentTest s1 = new StudentTest();
//		s1.setName("Shruti");
//		System.out.println(s1.getName());
//		s1.display();
//		s1.msg();
//		Student.extraMarks(78);

		Student s1 = new StudentTest();// reference of interface
		// s1.setName("Shruti");
		// System.out.println(s1.getName());
		s1.display();
		s1.msg();
		Student.extraMarks(78);

	}

}
