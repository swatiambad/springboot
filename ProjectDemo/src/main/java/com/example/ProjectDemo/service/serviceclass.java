package com.example.ProjectDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectDemo.model.User;
import com.example.ProjectDemo.model.UserRepository;

@Service
public class serviceclass {
 @Autowired
 private UserRepository repo;
 public serviceclass() {}
 public serviceclass(UserRepository repo) {
	 super();
	 this.repo=repo;
 }
 
 public void savebyuser(User user) {
	 repo.save(user);
 }
 public Iterable showuser() {
	 return repo.findAll();
 }
 public Iterable<User> deletename(String name){
	 repo.deleteByname(name);
	 return repo.findAll();
 }
 
}
