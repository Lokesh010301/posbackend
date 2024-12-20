package com.tatastrive.lokesh.pos.dto;

import org.mapstruct.Mapper;

import com.tatastrive.lokesh.pos.entity.User;



@Mapper(componentModel = "spring")

public interface UserMapper {
	
	UserDto toUserDTO(User user);
}
