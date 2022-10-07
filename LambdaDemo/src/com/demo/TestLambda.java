package com.demo;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// anonymous class

		Drawable d = new Drawable() {

			@Override
			public void draw() {
				System.out.println("Ia m drawing circle");

			}

		};

		d.draw();

		// lambda only works with functional interfaces
		// lambda with no parameters
		// (): Parameters
		// -> Arrow token
		// {}body;

		Drawable d1 = () -> {
			System.out.println("I am drawing with lambda");
		};
		d1.draw();

	}

}
