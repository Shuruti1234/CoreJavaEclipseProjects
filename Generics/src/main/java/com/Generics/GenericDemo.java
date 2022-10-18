package com.Generics;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generic<Integer> iob = new Generic<Integer>(88);
		Generic<Integer> iob = new Generic<>(88);
		iob.showType();

		int v = (Integer) iob.getOb();
		System.out.println(v);

		Generic<String> strob = new Generic<>("Java");
		strob.showType();

		String str = (String) strob.getOb();
		System.out.println(str);

		// iob = strob;

	}

}
