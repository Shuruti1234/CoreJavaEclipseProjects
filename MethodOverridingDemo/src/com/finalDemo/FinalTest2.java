package com.finalDemo;

public class FinalTest2 {

	final static int a = 90;
	final static int b = 77;

	public int c = 90;
//	public FinalTest() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

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

		// b = 90;

		FinalTest2 f1 = new FinalTest2();// 100 is the value of b
		// f1.b=89; cannot change the value
		f1.displayValue();

		FinalTest2 f2 = new FinalTest2();// 100 is the value of b
		f2.displayValue();

	}

}
