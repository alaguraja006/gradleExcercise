package com.gradle.gradleExcercise.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/open")
	public ResponseEntity<String> index(){
		return ResponseEntity.ok("welcome spring boot");
	}
}
