package com.inherit;

public class Cycle {

	private String wheels;
	private int seatLevel;
	private double price;
	private String brand;

	public Cycle() {
		super();
		System.out.println("---Default Constructor of Cycle------");
		// TODO Auto-generated constructor stub
	}

	public Cycle(String wheels, int seatLevel, double price, String brand) {
		super();
		System.out.println("---Parameterized Constructor of Cycle------");
		this.wheels = wheels;
		this.seatLevel = seatLevel;
		this.price = price;
		this.brand = brand;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public int getSeatLevel() {
		return seatLevel;
	}

	public void setSeatLevel(int seatLevel) {
		this.seatLevel = seatLevel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Cycle [wheels=" + wheels + ", seatLevel=" + seatLevel + ", price=" + price + ", brand=" + brand + "]";
	}

}
