package com.oops.encapsulation;

import java.util.Scanner;

public class PersonGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		for (;;) {
			System.out.println("Enter person name: \n");
			String name = scanner.next();
			
			System.out.println("Enter person age: \n");
			int age = scanner.nextInt();
			
			Person person = new Person(name, age);
			System.out.println("You have created: "+ person);
			
			System.out.println("Do you want to create one more person Enter Y/N");
			String decision = scanner.next();
			
			if ("N".equalsIgnoreCase(decision)) {
				break;
			}
		}

//		Person mridula = new Person("Mridula", 34);
//		Person arun = new Person("Arun", 36);
//
//		Person unknownPerson = new Person();
//
//		System.out.println(unknownPerson);
//		System.out.println(mridula);
//		System.out.println(arun);

	}

}
