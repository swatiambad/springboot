package com.example.ProjectDemo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectDemo.model.User;
import com.example.ProjectDemo.service.serviceclass;

@RestController
public class Restcontroller {
	
	@Autowired
	private serviceclass service;
	
	@RequestMapping("/getname")
	public String getname() {
		return "hello";
	}
	
	@PostMapping("saveuser")
	@Transactional
   public String reguser(@RequestBody User user) {
	 service.savebyuser(user);
	return "Hello "+user.getName()+"your registeration is successful";
	}
	
	@GetMapping("getuser")
	public Iterable<User>showalluesr(){
		return service.showuser();
	}
	 
	@GetMapping("deluser/{name}")
	@Transactional
	public Iterable<User> deleteuser(@PathVariable String name){
		return service.deletename(name);
	}
	

}
