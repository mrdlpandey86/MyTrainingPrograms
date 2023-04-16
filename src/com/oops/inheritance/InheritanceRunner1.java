package com.oops.inheritance;

import com.oops.inheritance.child.Truck;
import com.oops.inheritance.parent.Vehicle;

public class InheritanceRunner1 {

	public static void main(String[] args) {

		Truck truck = new Truck("Bose", "Three oint setabelt", "On");
		System.out.println(truck.toString());
		
		Vehicle vehicle = new Vehicle();
		
		Vehicle vehicle1 = new Vehicle("petrol", 2, 2, 20, "on");
	}

}
