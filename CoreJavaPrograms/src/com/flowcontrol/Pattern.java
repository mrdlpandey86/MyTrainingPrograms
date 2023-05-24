package com.flowcontrol;

public class Pattern {

	public static void main(String[] args) {

		int numberOfRows = 9;
		for (int i = 1; i <= numberOfRows; i++) {
			for (int k = 0; k < numberOfRows; k++) {
				if (k >= (i - 1)) {
					System.out.print(" ");
				}
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println("***********************************");
			
			
		}
	}
	



	}


