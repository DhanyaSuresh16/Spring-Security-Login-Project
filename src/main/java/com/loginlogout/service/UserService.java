package com.loginlogout.service;

import java.util.List;

import com.loginlogout.dto.UserDto;
import com.loginlogout.entity.User;

public interface UserService {

	 User saveUser(UserDto userDto);

	    User findByEmail(String email);

	    List<UserDto> findAllUsers();
}
