package com.demo;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a line:");
		String str = sc.nextLine();
		String words[] = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		// to find the largest and smallest word
		String small = words[0];
		String large = words[0];

		for (int i = 0; i < words.length; i++) {
			if (small.length() > words[i].length())
				small = words[i];

			if (large.length() < words[i].length())
				large = words[i];

		}

		System.out.println("Largest word: " + large);
		System.out.println("Smallest word: " + small);

		sc.close();
	}

}
