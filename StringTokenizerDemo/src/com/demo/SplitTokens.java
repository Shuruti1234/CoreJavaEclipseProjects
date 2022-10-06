package com.demo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitTokens {

	static void findWords(String str) {
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

	static void countWords(String str) {
		StringTokenizer st = new StringTokenizer(str);

		System.out.println("Number of words:" + st.countTokens());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a line:");
		String inputString = sc.nextLine();
		// findWords(inputString);
		countWords(inputString);

		sc.close();
	}

}
