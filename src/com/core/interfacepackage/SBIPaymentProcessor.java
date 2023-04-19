package com.core.interfacepackage;

public class SBIPaymentProcessor implements PaymentProcessor{
	
	@Override
	public  void processPayment() {
		System.out.println("Processing payment by SBI bank");
	}
}
