package com.demo;

public class EnumSwitch {

	enum Directions {
		NORTH, SOUTH, EAST, WEST
	}

	public static void main(String[] args) {

		Directions dir = Directions.EAST;

		switch (dir) {
		case NORTH -> System.out.println("North direction");
		case SOUTH -> System.out.println("South direction");
		case EAST -> System.out.println("East direction");
		case WEST -> System.out.println("West direction");
		default -> System.out.println("No direction");
		}

	}

}
