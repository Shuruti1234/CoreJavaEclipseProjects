package com.supereg;

public class Animal {

	private String name;
	private String color;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Animal(String color) {
		super();
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}

}
