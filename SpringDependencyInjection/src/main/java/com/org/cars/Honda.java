package com.org.cars;

import org.springframework.stereotype.Component;

import com.org.interfaces.Car;

@Component
public class Honda implements Car {

	public String specs() {
	return "Honda Car";
	}

}
