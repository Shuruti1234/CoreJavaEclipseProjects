package com.demo;

public class SchoolStudent extends Student {

	private String standard;
	private double percentage;

	public SchoolStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SchoolStudent(int id, String name, int age, float[] marks, String standard, double percentage) {
		super(id, name, age, marks);
		this.standard = standard;
		this.percentage = percentage;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "SchoolStudent [standard=" + standard + ", percentage=" + percentage + "]";
	}

}
