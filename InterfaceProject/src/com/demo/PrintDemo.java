package com.demo;

public class PrintDemo implements Modifiable, Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("---I am drawing---");

	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("---I am modifying---");

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("---I am printing---");

	}

}
