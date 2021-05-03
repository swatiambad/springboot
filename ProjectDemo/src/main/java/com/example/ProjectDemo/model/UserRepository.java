package com.example.ProjectDemo.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	public Iterable<User> deleteByname(String name);
}
