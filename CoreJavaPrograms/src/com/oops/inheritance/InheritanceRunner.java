package com.oops.inheritance;

import com.oops.inheritance.child.Bike;

public class InheritanceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Bike bike = new  Bike();
//bike.handle ="Short";
//bike.seats = 2;
//System.out.println(bike.handle);
//System.out.println(bike.getEngine());

		Bike bike = new Bike("short", "petrol", 2, 2, 20, "on");
		// System.out.println(bike.getHandle());

		// System.out.println(bike.getEngine());

		System.out.println(bike.toString());
		bike.run();
	}

}
