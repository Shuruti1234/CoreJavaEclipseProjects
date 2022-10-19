package com.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] grocery = { "Biscuits", "Shampoo", "Milk", "Pulses", "Flour" };

		List<String> groceryList = new ArrayList<String>();
		groceryList = Arrays.asList(grocery);

		System.out.println(groceryList);

		groceryList.set(2, "Cheese");

		System.out.println(groceryList);

	}

}
