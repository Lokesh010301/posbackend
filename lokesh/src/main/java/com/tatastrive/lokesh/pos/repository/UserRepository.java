package com.tatastrive.lokesh.pos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tatastrive.lokesh.pos.entity.User;



public interface UserRepository extends JpaRepository<User, Long > {

	public Optional<User> findByEmail(String email);
	
}
