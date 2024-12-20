package com.tatastrive.lokesh.pos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.lokesh.pos.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	public Optional<Customer> findByPhone(String phone);

}
