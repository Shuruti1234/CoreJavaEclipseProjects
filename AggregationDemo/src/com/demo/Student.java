package com.demo;

public class Student {

	private int id;
	private String name;
	private Address addr;// aggregation: weak assocition
	// private final Address addr1; // composition: strong

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

}

// Aggregation: has a relationship
//Student has an address
// Employee has an account
// reference of the class 