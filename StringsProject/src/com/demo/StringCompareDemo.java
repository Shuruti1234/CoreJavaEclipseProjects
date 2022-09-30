package com.demo;

public class StringCompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// content , refernce
		// equals()method
		// ==
		// compareTo()

		// equals(): compares the content
		String s1 = "Java";
		String s2 = "java";
		String s3 = new String("Java");
		System.out.println("Comparing string literals:" + s1.equals(s2));
		System.out.println("Comparing string literals (Case ignore)" + s1.equalsIgnoreCase(s2));
		System.out.println("comparing literal and object" + s1.equals(s3));

		// == operator: compares the refernce
		System.out.println("comparing 2 literals(==)" + (s1 == s2));
		System.out.println("comparing  literals and object(==)" + (s1 == s3));// gives false it compares the reference

		// comparison
		// compareTo
		// s1==s2 returns 0
		// s1>s2 return postive first letter 
		// s1<s2 return negative

		String m1 = "Java";
		String m2 = "Java";
		String m3 = "Language";

		System.out.println("comparing compareTo:" + m1.compareTo(m2));
		System.out.println("comparing compareTo:" + m1.compareTo(m3));// m1<m3  compares j and l and the diffrenece is 2
		System.out.println("comparing compareTo:" + m3.compareTo(m1));// m3>m1

	}

}
