package com.core.interfacepackage;

public class PaymentProcessorFactory {
	
	private ICICIPaymentProcessor iciciPaymentProcessor;
	private SBIPaymentProcessor sbiPaymentProcessor;
	
	public PaymentProcessorFactory() {
		super();
		this.iciciPaymentProcessor = new ICICIPaymentProcessor();
		this.sbiPaymentProcessor = new SBIPaymentProcessor();
	}
	
	public PaymentProcessor getPaymentProcesor(String bankType) {
		if("ICICI".equals(bankType)) {
			return iciciPaymentProcessor;
		}
		
		if("SBI".equals(bankType)) {
			return sbiPaymentProcessor;
		}
		
		if("AXIS".equals(bankType)) {
			return new PaymentProcessor() {
				
				@Override
				public void processPayment() {
					System.out.println("Processing payment by AXIS bank");
					
				}
			};
		}
		
		return null;
	}
}
