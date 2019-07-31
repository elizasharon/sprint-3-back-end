package com.pack.loginservice.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pack.loginservice.model.User;


public interface UserDao extends CrudRepository<User, Integer> {
	
	@Query("select u from User u where u.username=?1 AND u.password=?2")
	User findUser(String username, String password);
}
