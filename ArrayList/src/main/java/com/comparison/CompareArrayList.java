package com.comparison;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first array list
		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Grapes");
		fruits.add("Melon");

		System.out.println(fruits);

		// second array list
		List<String> fruits2 = new ArrayList<String>();
		fruits2.add("Mango");
		fruits2.add("Kiwi");
		fruits2.add("Grapes");
		fruits2.add("Melon");

		System.out.println(fruits2);

		// comparing 2 list

		boolean status = fruits.equals(fruits2);
		System.out.println(status);

		// adding fruits in second list

		fruits2.add("peaches");
		boolean status2 = fruits.equals(fruits2);
		System.out.println(status2);

	}

}
