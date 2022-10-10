package com.demo;

public class Student {

	private int id;
	private String name;
	private int age;
	private float[] marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, float[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float[] getMarks() {
		return marks;
	}

	public void setMarks(float[] marks) {
		this.marks = marks;
	}

	public double calcPercentage(float... marks) {
		double per = 0.0;
		for (int i = 0; i < marks.length; i++) {
			per += marks[i];
		}

		per = (per / 300) * 100;
		return per;
	}

}
