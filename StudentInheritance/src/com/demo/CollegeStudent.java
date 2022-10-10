package com.demo;

public class CollegeStudent extends Student {

	private String course;
	private int semester;
	private String division;

	public CollegeStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollegeStudent(int id, String name, int age, float[] marks, String course, int semester, String division) {
		super(id, name, age, marks);
		this.course = course;
		this.semester = semester;
		this.division = division;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(double p) {
		if (p > 75)
			this.division = "First";
		else if (p > 60)
			this.division = "Second";
		else if (p > 40)
			this.division = "Third";
		else
			this.division = "Fail";

	}

	@Override
	public String toString() {
		return "CollegeStudent [course=" + course + ", semester=" + semester + ", division=" + division + "]";
	}

}
