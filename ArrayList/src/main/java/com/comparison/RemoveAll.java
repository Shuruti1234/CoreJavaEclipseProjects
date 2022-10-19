package com.comparison;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {

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
		fruits2.add("Papaya");
		fruits2.add("Apple");

		System.out.println(fruits2);

		// to remove all the duplicate elements

		// fruits2.removeAll(fruits);
		// System.out.println(fruits2);

		// to have common elements
		fruits2.retainAll(fruits);
		System.out.println(fruits2);

	}

}
