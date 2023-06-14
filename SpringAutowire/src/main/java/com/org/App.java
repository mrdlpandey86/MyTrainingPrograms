package com.org;

import com.org.interfaces.Car;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.cars.Honda;
import com.org.cars.Toyata;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar= context.getBean("myHonda" ,Car.class);
		System.out.println(myCar.specs());		
		context.close();

	}

}
