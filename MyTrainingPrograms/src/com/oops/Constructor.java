package com.oops;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println(car.run());

		Car newCar = new Car(10, "on", "closed", "seated");

		System.out.println(newCar.run());

	}

}
