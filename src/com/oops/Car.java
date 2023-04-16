package com.oops;

public class Car {
	private int speed;
	private String engine;
	private String doors;
	private String driver;

	public Car() {
		super();
		speed = 0; // default constructor
		engine = "off";
		doors = "closed";
		driver = "not seated";
	}

	public Car(int speed, String engine, String doors, String driver) { // parameterize constructor
		super();
		this.speed = speed;
		this.engine = engine;
		this.doors = doors;
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;

	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String run() {
		if (speed > 0 && engine.equals("on") && doors.equals("closed") && driver.contentEquals("seated")) {
			return "Car is running!!!!";

		} else {
			return " car is not running!!!";
		}
	}
}
