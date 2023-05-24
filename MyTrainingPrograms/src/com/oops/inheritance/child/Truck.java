package com.oops.inheritance.child;

import com.oops.inheritance.parent.Vehicle;

public class Truck extends Vehicle {

	public String musicsystem;
	public String seatbelt;
	public String airConditioner;

	public Truck(String musicsystem, String seatbelt, String airConditioner) {
		super();
		this.musicsystem = musicsystem;
		this.seatbelt = seatbelt;
		this.airConditioner = airConditioner;
		System.out.println("A truck is created");
	}

	public String getMusicsystem() {
		return musicsystem;
	}

	public String getSeatbelt() {
		return seatbelt;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	@Override
	public String toString() {
		return "Truck [getMusicsystem()=" + musicsystem + ", getSeatbelt()" + seatbelt + ", getAirConditioner()" + airConditioner + "getLights()=" + getLights() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFueltank()=" + getFueltank()
				+ "]";
	}

}
