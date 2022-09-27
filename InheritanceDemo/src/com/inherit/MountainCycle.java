package com.inherit;

public class MountainCycle extends Cycle {

	private int noOfGears;
	private double speed;

	public MountainCycle() {
		super();
		System.out.println("---Default Constructor of Mountain Cycle------");

		// TODO Auto-generated constructor stub
	}

	public MountainCycle(String wheels, int seatLevel, double price, String brand, int noOfGears, double speed) {
		super(wheels, seatLevel, price, brand);
		System.out.println("---Parameterized Constructor of Mountain Cycle------");
		this.noOfGears = noOfGears;
		this.speed = speed;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "noOfGears=" + noOfGears + ", speed=" + speed + ", Wheels=" + getWheels() + ", Seat Level="
				+ getSeatLevel() + ", Price=" + getPrice() + ", Brand=" + getBrand();
	}

}
