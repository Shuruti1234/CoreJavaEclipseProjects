package com.CollectionsMap.Country;

import java.util.HashMap;
import java.util.Scanner;

public class CountryCollection {

	public static void main(String[] args) {

		// creating a hashmap
		HashMap<String, CountryInformation> ccode = new HashMap<>();

		// decalring a variable
		String country;

		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating countryInformation object
		CountryInformation cinfo = new CountryInformation();

		// adding some countries

		ccode.put("India", new CountryInformation("India", "+91", "New Delhi"));
		ccode.put("Australia", new CountryInformation("Australia", "+61", "Canberra"));
		ccode.put("South Korea", new CountryInformation("South Korea", "+82", "Seoul"));
		ccode.put("New Zealand", new CountryInformation("New Zealand", "+64", "Wellington"));
		ccode.put("France", new CountryInformation("France", "+3", "Paris"));
		ccode.put("Canada", new CountryInformation("Canada", "+1", "Ottawa"));
		ccode.put("UK", new CountryInformation("UK", "+44", "London"));

		System.out.println("Country Portal:");
		System.out.println("-----------------------------------");
		System.out.println("Enter the country:");
		country = sc.nextLine();

		// check : country is present in the map or not
		boolean status = ccode.containsKey(country);

		// displaying the information

		if (status) {
			System.out.println("----------------Country information---------------------");
			cinfo = ccode.get(country);
			System.out.println(cinfo);

		}

		else {
			System.out.println("-----Country not found----------");
		}

		// traversing list

//		for (Map.Entry<String, CountryInformation> code : ccode.entrySet()) {
//
//		}

		sc.close();

	}

}
