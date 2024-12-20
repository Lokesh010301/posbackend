package com.tatastrive.lokesh.pos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.lokesh.pos.entity.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
	public Optional<Product> findByName(String name);

}
