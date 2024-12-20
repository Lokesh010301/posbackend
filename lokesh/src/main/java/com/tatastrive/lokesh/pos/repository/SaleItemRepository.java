package com.tatastrive.lokesh.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.lokesh.pos.entity.SaleItem;



public interface SaleItemRepository extends JpaRepository<SaleItem, Long> {

}
