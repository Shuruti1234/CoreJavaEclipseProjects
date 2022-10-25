package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonListCompartorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> lop = new ArrayList<>();
		lop.add(new Person(101, "Prithwish", 23));
		lop.add(new Person(102, "Sweta", 25));
		lop.add(new Person(103, "Payal", 21));
		lop.add(new Person(104, "Royston", 26));
		lop.add(new Person(105, "Sonu", 20));

		// sorting using AIC

		System.out.println("-------using AIC---------");

		Comparator<Person> com = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}

		};

		Collections.sort(lop, com);

		for (Person p : lop) {
			System.out.println(p);
		}

		System.out.println("-------using Lambda---------");

		List<Person> lop1 = new ArrayList<>();
		lop1.add(new Person(101, "Prithwish", 23));
		lop1.add(new Person(102, "Sweta", 25));
		lop1.add(new Person(103, "Payal", 21));
		lop1.add(new Person(104, "Royston", 26));
		lop1.add(new Person(105, "Sonu", 20));

		Collections.sort(lop1, (Person p1, Person p2) -> {

			return p1.getName().compareTo(p2.getName());

		});

//		for (Person p : lop1) {
//			System.out.println(p);
//		}

		// iterate using forEach

		lop1.forEach((Person) -> System.out.println(Person));

	}

}
