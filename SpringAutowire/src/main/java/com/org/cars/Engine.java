package com.org.cars;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	String type = "V7";

	public Engine() {
		this.type = "New V7";
	}

}
