package com.demo2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lambda with multiple parameters
		Add a1 = (a, b) -> {
			System.out.println((a + b));
		};

		a1.computeSum(9, 7);

		/////////////////////////////////
		Add a2 = (int a, int b) -> {
			System.out.println((a + b));
		};

		a2.computeSum(5, 2);

		///////////////////////////////////

		// with return type

		Add2 a3 = (a, b) -> (a + b);// in single return statement body can be omitted
		System.out.println("With return:" + a3.computeSum(5, 8));

		///////////////////////////////

		Add2 a4 = (a, b) -> {
			return (a + b);
		};// in single return statement body can be omitted
		System.out.println("With return:" + a4.computeSum(5, 8));

		////////////////////////////////

		Add2 a5 = (a, b) -> {
			System.out.println("a :" + a);
			System.out.println("b :" + b);
			return (a + b);
		};// in single return statement body can be omitted
		System.out.println("With return:" + a5.computeSum(7, 2));

	}

}
