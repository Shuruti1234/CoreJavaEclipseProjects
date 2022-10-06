package com.demo;

public class NullEmpty {

	static void changeString(StringBuffer s1) {

		s1 = s1.append("Java");
		System.out.println("s1 is :" + s1);
		s1 = null;// only deletes s1 as a reference str still remains

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String s= null;
		StringBuffer str = new StringBuffer("Hi ");

		// System.out.println(s.length()); // Exception
		// System.out.println(str.length()); // length as 0
		changeString(str);

		System.out.println("Original str: " + str);

		String str2 = null;
		str2 = str2 + "A"; // null is given 4 bytes

		System.out.println("Length is" + str2.length());

		String str3 = "";
		str3 = str3 + "A"; // null is given 4 bytes

		System.out.println("Length is" + str3.length());

	}

}
