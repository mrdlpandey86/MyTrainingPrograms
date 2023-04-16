package com.mrdlpandey;

public class PrePostIncDec {

	public static void main(String[] args) {
		int a = 5;
		a = a++;
		System.out.println("Post-increment :" + a);

		a = ++a;
		System.out.println("Pre-Increment:" + a);

		a = a--;
		System.out.println("Post=Decrement:" + a);

		a = --a;
		System.out.println("Post-decrement:" + a);

	}

}
