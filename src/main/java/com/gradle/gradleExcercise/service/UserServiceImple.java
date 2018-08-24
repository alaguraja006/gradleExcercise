package com.gradle.gradleExcercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradle.gradleExcercise.domain.User;
import com.gradle.gradleExcercise.presistance.UserRepositry;
@Service
public class UserServiceImple implements UserService{
	@Autowired
	UserRepositry userRepositry;
	
	@Override
	public List<User> listAllUser() {
		return (List<User>)userRepositry.findAll();
	}

}
