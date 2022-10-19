package com.conversion;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("Mango");
		fruitsList.add("Kiwi");
		fruitsList.add("Grapes");
		fruitsList.add("Melon");

		// String[] s = new String[10]

		String[] fruits = fruitsList.toArray(new String[fruitsList.size()]);
		for (String f : fruits) {
			System.out.println(f);
		}

	}

}
