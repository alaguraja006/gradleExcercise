package com.gradle.gradleExcercise.presistance;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gradle.gradleExcercise.domain.User;
@Repository
public interface UserRepositry extends CrudRepository<User, Integer> {
	
	List<User> findAll();

}
