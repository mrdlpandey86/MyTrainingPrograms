package com.org.cars;

import org.springframework.stereotype.Component;

import com.org.interfaces.Car;

@Component
public class Toyata implements Car{

	public String specs() {
		// TODO Auto-generated method stub
		return "Toyata Car";
	}

}
