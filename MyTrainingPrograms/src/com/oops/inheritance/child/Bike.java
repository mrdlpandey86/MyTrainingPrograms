package com.oops.inheritance.child;

import com.oops.inheritance.parent.Vehicle;

public class Bike extends Vehicle {
	public String handle;

	public Bike(String handle) {
		super();
		this.handle = handle;
	}

	public String getHandle() {
		return handle;

	}

	@Override
	public String toString() {
		return "Bike [handle=" + handle + ", getLights()=" + getLights() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFueltank()=" + getFueltank()
				+ "]";
	}

	public void run() {
		System.out.println("Bike run");
	}

	public Bike(String handle, String engine, int wheels, int seats, int fueltank, String lights) {
		super(engine, wheels, seats, fueltank, lights);
		this.handle = handle;
	}

}
