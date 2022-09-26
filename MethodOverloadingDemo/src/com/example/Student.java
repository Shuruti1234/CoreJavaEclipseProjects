package com.example;

public class Student {

	private int id;
	private String name;
	private int age;
	private double score;
	private String course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, double score, String course) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
		this.course = course;
	}

	public Student(int id, String name, int age, double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
		this.course = "BCA";
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + ", course=" + course
				+ "]";
	}

}
