package com.firemans.web.course.resources;

import java.net.ResponseCache;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.firemans.web.course.CourseApplication;
import com.firemans.web.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping 
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "99999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
