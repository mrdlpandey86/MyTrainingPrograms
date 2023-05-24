package com.core.interfacepackage;

public class ICICIPaymentProcessor implements PaymentProcessor{
	
	@Override
	public  void processPayment() {
		System.out.println("Processing payment by ICICI bank");
	}
}
