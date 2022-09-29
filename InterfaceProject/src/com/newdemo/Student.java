package com.newdemo;

public interface Student {

	String course = "BCA";

	void display();// public and abstract

	default void msg() // JAVA 8
	{
		System.out.println("---College Student------");
	}

	static public void extraMarks(float marks)// JAVA 8
	{
		marks += 5;
		System.out.println("Marks:" + marks);
	}

}
