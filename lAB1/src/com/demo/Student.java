package com.demo;

public class Student {

	private String name;
	private int age;
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		this.name = "Unknown";
		this.age = 0;
		this.address = "Not availabe";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

}
