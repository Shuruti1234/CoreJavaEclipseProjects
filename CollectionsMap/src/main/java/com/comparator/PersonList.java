package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> lop = new ArrayList<>();
		lop.add(new Person(101, "Prithwish", 23));
		lop.add(new Person(102, "Sweta", 25));
		lop.add(new Person(103, "Payal", 21));
		lop.add(new Person(104, "Royston", 26));
		lop.add(new Person(105, "Sonu", 20));

		System.out.println("-------Age sort-----------");
		Collections.sort(lop, new AgeComparator());

		for (Person p : lop) {
			System.out.println(p);
		}

		System.out.println("-------Name sort-----------");
		Collections.sort(lop, new NameComparator());

		for (Person p : lop) {
			System.out.println(p);
		}

	}

}
