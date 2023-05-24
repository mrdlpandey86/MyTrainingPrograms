/**
 * 
 */
package com.mrdlpandey;

/**
 * @author mrdlp
 *
 */
public class DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printByte();
		System.out.println();
		printInteger();
		System.out.println();
		printShort();
		System.out.println();
		printBoolean();

	} 

	private static void printByte() {
		//byte b = 100
		//System.out.println("The value of b is: " + b);
		System.out.println("Min value of byte data type is: " + Byte.MIN_VALUE);
		System.out.println("Max value of byte data type is: " + Byte.MAX_VALUE);
	}

	private static void printInteger() {
		//int b = 10;
		//System.out.println("The value of b is: " + b);
		System.out.println("Min value of int data type is: " + Integer.MIN_VALUE);
		System.out.println("Max value of int data type is: " + Integer.MAX_VALUE);
	}

	private static void printShort() {
		//short b = 10;
		//System.out.println("The value of b is: " + b);
		System.out.println("Min value of short data type is: " + Short.MIN_VALUE);
		System.out.println("Max value of short data type is: " + Short.MAX_VALUE);
	}
	
	private static void printBoolean() {
		boolean bool= true; 
		System.out.println("the value of bool is :"+bool);
		
	}
	
}
