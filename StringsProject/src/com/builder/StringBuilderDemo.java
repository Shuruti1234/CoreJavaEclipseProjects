package com.builder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// non snchronization
		StringBuilder str = new StringBuilder();
		System.out.println("Length:" + str.length());
		System.out.println("Capacity:" + str.capacity());

		StringBuilder str1 = new StringBuilder("Java");
		System.out.println("Length:" + str1.length());
		System.out.println("Capacity:" + str1.capacity());

		// all same methods

	}

}
