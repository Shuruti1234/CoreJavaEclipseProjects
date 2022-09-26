package com.demo;

public class EnumMain {

	enum Colors {
		RED(6), WHITE(7), BLACK(9), BLUE(8);

		// constructor : giving value sto constant: private

		private int value;// no instance can be created

		private Colors(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		final String Course = "BTECH";// declaring constant
//		System.out.println(Course);
//		
//		//Course= "MCA";

//		enum Colors {
//			RED, WHTE,BLACK , BLUE
//		}

		// arrays of constants
		// values: array contaning all enums
		for (Colors c : Colors.values()) {
			System.out.println(c + " " + c.value);
		}

	}

}
