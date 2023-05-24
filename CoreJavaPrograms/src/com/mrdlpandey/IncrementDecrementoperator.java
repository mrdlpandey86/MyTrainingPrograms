/**
 * 
 */
package com.mrdlpandey;

/**
 * @author mrdlp
 *
 */
public class IncrementDecrementoperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 13;

		int num3 = num1++;
		System.out.println(num3);

		int num4 = ++num1;
		System.out.println(num4);

		int num5 = num2--;
		System.out.println(num5);

		int num6 = --num2;
		System.out.println(num6);
		
		num6 -=num2;
		System.out.println(num6  );
	}

}
