package com.nongeneric;

public class NonGenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonGeneric iob = new NonGeneric(88);
		iob.showType();

		int v = (Integer) iob.getOb();
		System.out.println(v);

		NonGeneric strob = new NonGeneric("Java");
		strob.showType();

		String str = (String) strob.getOb();
		System.out.println(str);

		iob = strob;

	}

}
