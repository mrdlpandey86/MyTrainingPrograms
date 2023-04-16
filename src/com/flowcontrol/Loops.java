package com.flowcontrol;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("************************************");

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("************************************");
		int j = 0;
		do {
			j++;
			System.out.println(j);
		} while (j < 10);
	}

}
