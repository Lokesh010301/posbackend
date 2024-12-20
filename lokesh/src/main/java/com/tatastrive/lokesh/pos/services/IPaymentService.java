package com.tatastrive.lokesh.pos.services;

import java.util.List;

import com.tatastrive.lokesh.pos.entity.Payment;



public interface IPaymentService {
	public Payment addPayment(Payment payment);
	//public Payment addCountries(List<E>);
	public Payment getPayment(long id);
	public List<Payment> getPayments();
	public Payment updatePayment(long id,Payment payment);
	public String  deletePayment(long id);

}
