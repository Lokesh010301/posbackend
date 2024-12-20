package com.tatastrive.lokesh.pos.services;

import java.util.List;

import com.tatastrive.lokesh.pos.dto.UserDto;
import com.tatastrive.lokesh.pos.entity.User;

public interface IUserService {
	public UserDto addUser(User user);
	//public User addCountries(List<E>);
	public User getUser(long id);
	public List<User> getUsers();
	public User updateUser(long id,User user);
	public String  deleteUser(long id);

}
