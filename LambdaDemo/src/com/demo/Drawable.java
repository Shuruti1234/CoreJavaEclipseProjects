package com.demo;

@FunctionalInterface
public interface Drawable {

	public void draw(); // can have only one abstarct method

	// public void print();

	default void sayShape() {
		System.out.println("Shapes");
		method1();
	}

	private void method1() {
		System.out.println("In method 1");
	}

}
