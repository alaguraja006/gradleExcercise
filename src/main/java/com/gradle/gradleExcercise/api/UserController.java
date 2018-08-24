package com.gradle.gradleExcercise.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gradle.gradleExcercise.domain.User;
import com.gradle.gradleExcercise.presistance.UserRepositry;
import com.gradle.gradleExcercise.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	UserRepositry userRepo;
	
	@RequestMapping(value="/user",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<List<User>> list(){
		List<User> user = userService.listAllUser();
//		System.out.println(user);
		return ResponseEntity.ok(user);
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public ResponseEntity<String> create(@RequestBody User[] user){
		for(int i=0;i<user.length;i++){
		userRepo.save(user[i]);
		}
		return ResponseEntity.ok("hai");
	}
	
	
}
