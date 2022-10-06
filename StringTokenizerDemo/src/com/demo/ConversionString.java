package com.demo;

public class ConversionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 56;
		String str = String.valueOf(i);
		// System.out.print(str);

		int b = 90;
		i = i + b;
		str = str + b;
		System.out.println(i);
		System.out.println(str.hashCode());

		System.out.println(str);

	}

}
