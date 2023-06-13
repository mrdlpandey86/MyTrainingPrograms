package com.org;

import com.org.interfaces.Car;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.cars.Honda;
import com.org.cars.Toyata;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car honda = new Honda();
//		Car toyata = new Toyata();
//		System.out.println(honda.specs());
//		System.out.println(toyata.specs());
//
//		Car myCar = new Honda();
//		System.out.println(myCar.specs());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar= context.getBean("toyata" ,Toyata.class);
		System.out.println(myCar.specs());		
		context.close();

	}

}
