package com.flowcontrol;

public class IfElse {

	public static void main(String[] args) {
		int marks = 56;

		if (marks >= 60) {
			System.out.println("A Grade");
		} else if (marks < 60 && marks >= 45) {
			System.out.println("B Grade");
		} else if (marks < 45 && marks >= 33) {
			System.out.println("C Grade");
		} else {

			System.out.println("D Grade");
		}

	}

}
