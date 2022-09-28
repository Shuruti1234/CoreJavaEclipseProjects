package com.finalDemo;

public class FinalTest {

	final int a = 90;
	final int b;

//	public FinalTest() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public FinalTest(int b) {
		super();
		this.b = b;
	}

	void changeValue() {
		// a=100; cant change the value
	}

	void displayValue() {
		// a=100; cant change the value
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalTest f1 = new FinalTest(100);// 100 is the value of b
		// f1.b=89; cannot change the value
		f1.displayValue();

		FinalTest f2 = new FinalTest(78);// 100 is the value of b
		f2.displayValue();

	}

}
