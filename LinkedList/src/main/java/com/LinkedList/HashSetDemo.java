package com.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("Dairy Milk");
		linkList.add("5 Star");
		linkList.add("KitKat");
		linkList.add("Bournville");
		linkList.add("Bournville");

		System.out.println(linkList);

		// HashSet<Integer> set = new HashSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(2); // ignores the duplicate values

		// System.out.println(set);

		// removes all the duplicate values from the list
		HashSet<String> set = new HashSet<>(linkList);

		System.out.println(set);

		set.add(null);

		System.out.println(set);

	}

}
