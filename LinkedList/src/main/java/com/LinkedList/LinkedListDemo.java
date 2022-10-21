package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("Dairy Milk");
		linkList.add("5 Star");
		linkList.add("KitKat");
		linkList.add("Bournville");

		System.out.println(linkList);

		// adding at specific position

		linkList.add(1, "Amul");
		System.out.println(linkList);

		List<String> linkList2 = new LinkedList<String>();
		linkList2.add("Ferrero Rocher");
		linkList2.add("Lindt");

		linkList.addAll(linkList2);
		System.out.println(linkList);

		linkList.addFirst("Toblerone");
		System.out.println(linkList);

		linkList.removeAll(linkList2);
		System.out.println(linkList);

		linkList.add("5 Star");
		System.out.println(linkList);

		linkList.removeFirstOccurrence("5 Star");
		System.out.println(linkList);

		// to print the list in reverse order
		Iterator<String> itr = linkList.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
