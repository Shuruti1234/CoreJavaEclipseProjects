package com.Generics.copy;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generic<Integer> iob = new Generic<Integer>(88);
		Generic<Integer> iob = new Generic<>(88, 99);
		iob.showType();

		System.out.println(iob.getNum1() + iob.getNum2());

		Generic<String> strob = new Generic<>("Java", "Programs");
		strob.showType();

		System.out.println(strob.getNum1() + " " + strob.getNum2());

		// iob = strob;

	}

}
