package com.billcollectorusingAnnotations;


public class BillCollectorPayment {
	
	private Payment payment;
	
	public BillCollectorPayment() {
		
		System.out.println("Default constructor BillCollectorPayment is running ");
	}

	public Payment getPay() {
		return payment;
	}

	public void setPay(Payment pay) {
		this.payment = pay;
	}
	
	public void billPay(double d) {
		String result=payment.pay();
		System.out.println("Payment sucessfully fetched the data ->"+ result+"Amount ===>"+d);
	}

}
