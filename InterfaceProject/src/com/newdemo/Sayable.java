package com.newdemo;

public interface Sayable {

	default void saySomething() {
		System.out.println("-----I am saying something--------");
		sayNothing();
	}

	void say(); // abstract method

	private void sayNothing() {
		System.out.println("-----I am saying nothing-------"); // default method is compulsory
	}
}
