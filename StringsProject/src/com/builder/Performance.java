package com.builder;

public class Performance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long stTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");

		for (int i = 0; i < 1000000; i++) {
			sb.append('t');
		}

		long timeTaken = System.currentTimeMillis() - stTime;

		System.out.println("Time taken by StringBuffer:" + timeTaken);

		stTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Java");

		for (int i = 0; i < 1000000; i++) {
			sb1.append('t');
		}

		timeTaken = System.currentTimeMillis() - stTime;

		System.out.println("Time taken by StringBuilder:" + timeTaken);

	}

}
