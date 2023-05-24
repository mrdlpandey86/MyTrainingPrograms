/**
 * 
 */
package com.mrdlpandey;

import java.util.Scanner;

/**
 * @author mrdlp
 *
 */
public class SquareOfANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a integer");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Entered number is: " + number);
		printSquareOfGivenNumber(number);
		
		System.out.println("Please enter a double");
		double doubleNumber = scanner.nextDouble();
		System.out.println("Entered number is: " + doubleNumber);
		printSquareOfGivenNumber(doubleNumber);
	}

	private static void printSquareOfGivenNumber(int num) {
		System.out.println("Square of integer " + num + " number is :" + num * num);
	}
	
	private static void printSquareOfGivenNumber(double num) {
		System.out.println("Square of double " + num + " number is :" + num * num);
	}

}
