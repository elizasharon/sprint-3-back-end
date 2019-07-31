package com.pack.loginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.pack.loginservice.dao.UserDao;
import com.pack.loginservice.model.User;

@RestController
public class LoginServiceController implements CommandLineRunner {

	@Autowired
	public UserDao userDao;

	@PostMapping("/")
	public Boolean test(@RequestBody User user) {

//		System.out.println(userDao.findUser(user.getUsername(), user.getPassword()));

		User checkUser = userDao.findUser(user.getUsername(), user.getPassword());
	
		try {

			if ((user.getUsername().equals(checkUser.getUsername()))
					&& (user.getPassword().equals(checkUser.getPassword()))) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User(1, "Sheldon", "Cooper");
		userDao.save(user);

	}

}
