package com.access;

public class TestConstructor {

	private int a;

	private TestConstructor(int a) {
		super();
		this.a = a;
	}

	void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestConstructor t1 = new TestConstructor(5);
		t1.display();

	}

}
