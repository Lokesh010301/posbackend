package com.tatastrive.lokesh.pos.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.lokesh.pos.entity.Payment;



public interface PaymentRepository extends JpaRepository<Payment, Long> {
	
	/*
	 * public Payment findByDate(LocalDateTime date); public Payment
	 * findByMethod(String paymentMethod);
	 */

}
