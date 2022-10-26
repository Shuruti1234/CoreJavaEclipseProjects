/*
 * Employee POJO class
 * @author
 * @Date
 */

package com.StreamAPI;

//declaring class
public class Employee {

	// instance variables
	private int eid;
	private String ename;
	private String dept;
	private double salary;

	// default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterised constructor
	public Employee(int eid, String ename, String dept, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}

	// getters and setters
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// toString method
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
//end of class
