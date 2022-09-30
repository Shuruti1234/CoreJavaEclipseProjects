package com.buffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		// mutable
		// empty string
		StringBuffer str = new StringBuffer();
		System.out.println("Length :" + str.length()); // 0
		System.out.println("Capacity:" + str.capacity()); // 16

		// giving capacity
		StringBuffer str1 = new StringBuffer(30);
		System.out.println("Length :" + str1.length()); // 0
		System.out.println("Capacity:" + str1.capacity()); // 30

		// giving str
		StringBuffer str2 = new StringBuffer("Java");
		System.out.println("Length :" + str2.length()); // 0
		System.out.println("Capacity:" + str2.capacity()); // 16

		// append
		str2.append("  is Great");
		System.out.println(str2);

		// insert
		str2.insert(4, " language");
		System.out.println(str2);

		// replace
		str2.replace(4, 13, " programming");
		System.out.println(str2);

		// delete
		str2.delete(16, 18);
		System.out.println(str2);

		// reverse
		StringBuffer strRev = str2.reverse();
		System.out.println(strRev);

	}

}
