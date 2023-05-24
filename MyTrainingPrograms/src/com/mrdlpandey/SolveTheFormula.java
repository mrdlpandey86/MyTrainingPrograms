/**
 * 
 */
package com.mrdlpandey;

import java.util.Scanner;

/**
 * @author mrdlp
 *
 */
public class SolveTheFormula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		float b = 12.54f;
		float sum1 = a + b;
		float sum2 = a * a + 2 * a * b + b * b;
		// System.out.println("addition: " +sum);
		System.out.println("Square of ( " + a + " + " + b + ") is " + sum1 * sum1);
		System.out.println(" Value by using (a + b) square formula: " + sum2);

	}

}
