package com.bwl.clima.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwl.clima.model.User;
import com.bwl.clima.service.UserService;

@RestController
@RequestMapping("/users/")
public class UserRest {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	private ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.findAll());
	}
	@PostMapping
	private ResponseEntity<User> saveUser (@RequestBody User user){
		try {
			User userGuardado = userService.save(user);
			return ResponseEntity.created(new URI("/users/"+userGuardado.getId())).body(userGuardado);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
