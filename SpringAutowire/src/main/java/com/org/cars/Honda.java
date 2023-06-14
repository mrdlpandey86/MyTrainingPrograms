package com.org.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.org.interfaces.Car;

@Component("myHonda")
public class Honda implements Car {
 
	@Autowired
	private Engine engine;

	public String specs() {
		String spec = "Honda car with engine type " + engine.type;
		return spec;
	}

}
