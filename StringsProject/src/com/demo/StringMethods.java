package com.demo;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome Java";
		// charAt

		System.out.println("Character at 4th position :" + s.charAt(3));

		// length: property ar.length
		// string : length();

		System.out.println("Length is :" + s.length());

		String s1 = "Hi!";
		s1 = s1.concat(s);
		System.out.println("Concantenated string is:" + s1);

		// substring

		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 7));

		// to find the character sequence
		System.out.println(s.contains("java"));

		// null

		String s2 = "";

		System.out.println(s2.isEmpty());

		// replacing
		String s3 = s1.replace("Java", "C++");
		System.out.println(s3);

		// find the postion of character

		int position = s3.indexOf("C");
		System.out.println(position);

		s3 = s3.toLowerCase();
		System.out.println(s3);

		// toUpperCase()

		// trim just remove starting and ending whitespaces

		String s4 = "      Hi Java    ";
		System.out.println(s4);
		System.out.println(s4.length());
		s4 = s4.trim();
		System.out.println(s4);
		System.out.println(s4.length());

	}

}
