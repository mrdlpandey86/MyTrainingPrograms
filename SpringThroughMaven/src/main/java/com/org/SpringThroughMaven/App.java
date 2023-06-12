package com.org.SpringThroughMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorldBean obj = (HelloWorldBean) context.getBean("helloworldid");

		obj.print();
	}

}
