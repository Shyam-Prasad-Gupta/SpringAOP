package com.shyam.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	public void addUser(String userName, int age) {
		System.out.println("Added the new user with name- " + userName + " \n age: " + age + " into the DB.");
	}

	public boolean deleteUser(String userName) {

		Integer.parseInt(userName);//doing this just to created an exception for after throwing
		System.out.println("User with name: " + userName + " is successfully deleted.");
		return true;
	}

	public User getUser() {
		User user = new User();
		user.setId(100);
		user.setName("Shyam");
		user.setAge(25);

		return user;
	}

}
