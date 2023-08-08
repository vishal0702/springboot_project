package com.aop.services;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amount) {

		// payment code
		System.out.println(amount+" Amount Debited");
		
		//Transaction process
		System.out.println(amount+" Amount Credited");

	}

}
