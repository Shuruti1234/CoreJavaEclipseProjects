package com.demo;

public class StringDemo {

	public static void main(String[] args) {

		String originalS = new String("Welcome"); // by literal : String constant pool: pool heap
		// new : object : non pool heap

		String copieds = originalS;
		System.out.println("Original string is :" + originalS);
		System.out.println("Copied String is :" + copieds);

		originalS = originalS.concat(" Java");

		System.out.println("Original string is :" + originalS);
		System.out.println("Copied String is :" + copieds);

	}
}
