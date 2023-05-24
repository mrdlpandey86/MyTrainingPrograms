package com.mrdlpandey;

public class logicalOperators {

	public static void main(String[] args) {
		boolean bool1 = true;
		boolean bool2 = false;

		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
		System.out.println(!bool1);

		int a = 3;
		int b = 4;

		System.out.println(a & b);
		System.out.println(a | b);

		Integer a1 = null;

		System.out.println(bool1 | a1.intValue() == 3);

	}

}
