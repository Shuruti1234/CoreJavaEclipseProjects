package com.example;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
		try {
			// converting string to int
			String s = sc.next();
			int i = Integer.parseInt(s);

			// division
			int d = 89 / i;

			System.out.println(d);
		} catch (NumberFormatException e) {
			System.out.println("The string is not a number");
		}

		catch (Throwable m) {
			System.out.println(m);
		}

		////////// multiple catch block////////////

		System.out.println("Enter a word:");
		String str = sc.next();
		System.out.println(str);
		sc.close();
	}

}
