package com.inherit;

public class ElectricCycle extends Cycle {

	private String battery;

	public ElectricCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricCycle(String wheels, int seatLevel, double price, String brand, String battery) {
		super(wheels, seatLevel, price, brand);
		this.battery = battery;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "ElectricCycle [battery=" + battery + ", toString()=" + super.toString() + "]";
	}

}
