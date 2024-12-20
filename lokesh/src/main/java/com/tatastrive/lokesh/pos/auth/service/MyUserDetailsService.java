package com.tatastrive.lokesh.pos.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tatastrive.lokesh.pos.entity.User;
import com.tatastrive.lokesh.pos.repository.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User user =repo.findByEmail(email).orElseThrow(
				
				()-> {throw new UsernameNotFoundException("User Not Found");}
			);
		
	    return new UserPrincipal(user);
	}

}
