package com.shyam.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shyam.springaop.config.DemoConfig;
import com.shyam.springaop.dao.AccountDAO;
import com.shyam.springaop.dao.User;
import com.shyam.springaop.dao.UserDAO;

public class DriverProgram {

	public static void main(String args[]) {

		// read the spring configuratin java class file
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				DemoConfig.class);

		// get the bean from the application context or spring container
		AccountDAO accountDAO = annotationConfigApplicationContext.getBean(AccountDAO.class);
		UserDAO userDAO = annotationConfigApplicationContext.getBean(UserDAO.class);

		// call the business method
		// accountDAO.addAccount();

		// call the method again
		// accountDAO.addAccount();

		// call the deleteAccount method
		// accountDAO.deleteAccount(10);

		// add user of userdao class
		// userDAO.addUser("Shyam");

		// add user by passing two params
		// userDAO.addUser("Shyam", 20);

		// delete user from database
		userDAO.deleteUser("shyam");

		//get the user from database
		//User usr = userDAO.getUser();
		//System.out.println(usr.toString());
		
		// close the context
		annotationConfigApplicationContext.close();

	}

}
