package com.inherit;

public class MountainRacingCycle extends MountainCycle {

	private boolean GPS;
	private String light;
	private String speedBooster;

	public MountainRacingCycle() {
		super();
		System.out.println("---Default Constructor of MountainRacer Cycle------");
		// TODO Auto-generated constructor stub
	}

	public MountainRacingCycle(String wheels, int seatLevel, double price, String brand, int noOfGears, double speed,
			boolean gPS, String light, String speedBooster) {
		super(wheels, seatLevel, price, brand, noOfGears, speed);
		System.out.println("---Param Constructor of Mountain Racer Cycle------");
		this.GPS = gPS;
		this.light = light;
		this.speedBooster = speedBooster;
	}

	public boolean isGPS() {
		return GPS;
	}

	public void setGPS(boolean gPS) {
		GPS = gPS;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public String getSpeedBooster() {
		return speedBooster;
	}

	public void setSpeedBooster(String speedBooster) {
		this.speedBooster = speedBooster;
	}

	@Override
	public String toString() {
		return "MountainRacingCycle [GPS=" + GPS + ", light=" + light + ", speedBooster=" + speedBooster
				+ ", toString()=" + super.toString() + "]";
	}

}
