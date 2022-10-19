package com.comparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> company = new ArrayList<String>(Arrays.asList("Java", "C", "C++", ".net"));

		System.out.println(company);
		boolean present;
		present = company.contains("Java");
		System.out.println(present);

		present = company.contains("Python");
		System.out.println(present);

		company.remove("C");
		System.out.println(company);

		// company over
		company.clear();
		System.out.println(company);

	}

}
