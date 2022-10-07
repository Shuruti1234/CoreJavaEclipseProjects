package com.demo1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lambda with 1 parameter and no return type

		Myname n1 = (name) -> {
			System.out.println("Hello " + name);
		};
		n1.printName("Shruti");

		// bracket can be omitted with single parameter
		Myname n3 = name -> {
			System.out.println("Hello " + name);
		};
		n3.printName("ABC");

		/////////////////////////////////////

		// lambda with 1 parameter and return type
		Myname2 n2 = (name) -> {
			return name;
		};
		System.out.println("Hello " + n2.printName("Krushikesh"));

	}

}
