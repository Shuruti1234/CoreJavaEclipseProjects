package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str[] = new String[10];
//		str[0] = "Banana";
//		str[1] = "Kiwi";
//
//		for (String s : str) {
//			System.out.println(s);
//		}

		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Grapes");
		fruits.add("Melon");

		// printing all elements
		System.out.println(fruits);

		// iteration using enhanced for
		for (String s : fruits) {
			System.out.println(s);
		}

		// Iterate through iterator
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// updating an element
		System.out.println(fruits.get(2));

		fruits.set(2, "Watermelon");

		System.out.println(fruits);

		// sorting all the elements of arraylist

		Collections.sort(fruits);
		System.out.println(fruits);

		// to print in reverse order
		ListIterator<String> itr1 = fruits.listIterator(fruits.size());
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

		// lambda
		// Java 8 forEach

		fruits.forEach(a -> {
			System.out.println(a);
		});

	}

}
