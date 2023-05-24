package com.oops.inheritance.parent;

public class Vehicle {
	private String engine;
	private int wheels;
	private int seats;
	private int fueltank;
	private String lights;

	public Vehicle() {
		super();
	}

	public Vehicle(String engine, int wheels, int seats, int fueltank, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueltank = fueltank;
		this.lights = lights;
	}

	public String getLights() {
		return lights;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFueltank() {
		return fueltank;
	}

	public void run() {
		System.out.println("Run Vehicle");
	}

}
