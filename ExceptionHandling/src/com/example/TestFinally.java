package com.example;

public class TestFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
			String s = null;
			System.out.println(s.length());
		} finally {

			System.exit(0);// to come out the program...

		}

	}

}
