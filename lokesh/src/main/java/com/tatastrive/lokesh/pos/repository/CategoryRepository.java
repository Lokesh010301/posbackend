package com.tatastrive.lokesh.pos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tatastrive.lokesh.pos.entity.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {

	public Optional<Category> findByName(String name);

}
