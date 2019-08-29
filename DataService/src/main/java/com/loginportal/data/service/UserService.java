package com.loginportal.data.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginportal.data.model.User;
import com.loginportal.data.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Transactional
	public Optional<User> getUser(User user) {

		if (user.getUserID() != null) {
			return userRepository.getUserByUserID(user.getUserID());
		} else {
			return userRepository.getUserByEmailID(user.getEmailID());
		}
	}

	@Transactional
	public User createUser(User user) {
		Timestamp timestamp = new Timestamp((new Date()).getTime());
		user.setAccountCreationTime(timestamp);
		logger.info("{}", user.getAccountCreationTime());
		return userRepository.save(user);
	}

	@Transactional
	public void delete(User user) {
		userRepository.deleteUser(user.getUserID());
	}

	@Transactional
	public int updateAccountStatus(User user) {
		return userRepository.updateAccountStatus(user.getAccountStatus(), user.getUserID());
	}

	@Transactional
	public void deleteUserByAccountStatus() {
		userRepository.deleteUserByAccountStatus();
	}

	@Transactional
	public List<User> getUsers() {
		return userRepository.getUsers();
	}

	@Transactional
	public int updateUser(User user) {
		return userRepository.updateUser(user.getUserRole(), user.getFirstName(), user.getLastName(), user.getPhoneNo(),
				user.getGender(), user.getMaritalStatus(), user.getProfession(), user.getDateOfBirth(),
				user.getUserID());
	}
}
