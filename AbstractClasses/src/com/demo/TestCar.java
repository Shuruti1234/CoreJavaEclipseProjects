package com.demo;

public class TestCar {

	public static void main(String args[]) {

		Car c;

		BMWCar c1 = new BMWCar();
		c = c1;
		c.startCar();

		AudiCar c2 = new AudiCar();
		c = c2;
		c.startCar();// dynamic method dispatch

	}
}
