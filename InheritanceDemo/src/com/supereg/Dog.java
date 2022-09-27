package com.supereg;

public class Dog extends Animal {

	private String color;
	private String breed;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String color, String breed) {
		super(color);
		// this.color = color;
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [color=" + super.getColor() + ", breed=" + breed + "]";
	}

}
