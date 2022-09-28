package com.realdemo;

public class Test {

	public static void main(String[] args) {

		CanaraBank ac1 = new CanaraBank();
		ac1.setRateOfInterest();
		System.out.println(ac1.getRateOfInterest());

		SBIBank ac2 = new SBIBank();
		ac2.setRateOfInterest();
		System.out.println(ac2.getRateOfInterest());

	}

}
