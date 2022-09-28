package com.realdemo;

public class SBIBank extends Bank {

	@Override
	public void setRateOfInterest() {
		this.rateOfInterest = 8.5;
		this.name = "SBI";
	}

}
