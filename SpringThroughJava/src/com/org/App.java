package com.org;
import org.springframework.context.ApplicationContext;
public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context= new  ClassPathXmlApplicationContext("Beans.xml");
 HelloWorldBean obj = (HelloWorldBean)  context.getBean("helloworldid");
		 
 obj.print();
	}

}
