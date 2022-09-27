package com.main;

import com.inherit.ElectricCycle;
import com.inherit.MountainRacingCycle;

public class CycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MountainCycle cycle1 = new MountainCycle();
//		System.out.println(cycle1);
//
//		MountainCycle cycle2 = new MountainCycle("Alloy", 3, 67000.90, "Firefox", 5, 30);
//		System.out.println(cycle2);

		MountainRacingCycle cycle2 = new MountainRacingCycle("Alloy", 3, 67000.90, "Firefox", 5, 30, true, "LED",
				"NOS");
		System.out.println(cycle2);

		ElectricCycle ecycle1 = new ElectricCycle("Rim wheels", 2, 25000.50, "Avon", "Lithium");
		System.out.println(ecycle1);
	}

}
