package com.core.interfacepackage;

import java.util.Scanner;

public class AmazonOrderBookingClass {

	public static void main(String[] args) {

		PaymentProcessorFactory factory = new PaymentProcessorFactory();
		System.out.println("Enter bank name from which you want to make payment");

		Scanner scanner = new Scanner(System.in);
		String bankType = scanner.next();

		PaymentProcessor paymentProcessor = factory.getPaymentProcesor(bankType);

		if (paymentProcessor == null) {
			System.out.println("The bank " + bankType + " is not supported for payment");
		} else {
			paymentProcessor.processPayment();
		}
		scanner.close();
	}
}
