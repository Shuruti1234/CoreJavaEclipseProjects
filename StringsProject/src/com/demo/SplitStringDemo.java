package com.demo;

public class SplitStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// extracting words
		String s1 = "My name / is Shuruti";
		String[] words = s1.split("/");// separting /
		// String[] words = s1.split("\\s"); separates all the words

		for (String s : words) {
			System.out.println(s);
		}

		// extracting all characters
		String s2 = "Welcome to Java";
		char[] arr = s2.toCharArray();

		for (char c : arr) {
			System.out.println(c);
		}

	}

}
