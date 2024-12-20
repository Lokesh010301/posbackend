package com.tatastrive.lokesh.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.lokesh.pos.entity.Supplier;



public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}