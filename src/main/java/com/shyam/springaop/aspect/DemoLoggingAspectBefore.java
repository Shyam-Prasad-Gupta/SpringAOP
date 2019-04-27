package com.shyam.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspectBefore {

	// this is where we add all our related advices for logging
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>> executed before the method addAccount of class AccountDAO.");
	}

	// this advice is applied whenever useraccount is deleted
	@Before("execution(public boolean com.shyam.springaop.dao.AccountDAO.deleteAccount(*))")
	public void beforeDeleteAccountAdvice() {
		System.out.println("\n=====>> executed before the method deleteAccount of class AccountDAO.");
	}

	// this advice is applied wherever any method with name starting with add is
	// called.
	@Before("execution(public void add*(*))")
	public void beforeAddStarMethod() {
		System.out.println("\n=====>> a method with method name starts with add is called.");
	}

	// this advice is applied on a method whose return type is boolean and input
	// parameter is string
	@Before("execution(public boolean add*(String))")
	public void beforeAddUserMethod() {
		System.out.println("Add method of class is called: " + getClass());
	}

	// this advice is applied on a method whose return type is boolean and takes two
	// input
	// @Before("execution(public void addUser(String, int))")
	// @Before("execution(public void addUser(..))")
	@Order(2)
	@Before("execution(public void addUser(String, int))")
	public void beforeAddUserMethodUserDAO() {
		System.out.println("Add method of class is called: " + getClass());
		System.out.println("Moreover this method takes two params as input one is string and another is int.");
	}

	@Order(1)
	@Before("execution(public void addUser(String, int))")
	public void beforeAddUserMethodUserDAO(JoinPoint jp) {
		System.out.println("Method signature from joinpoint is: " + jp.getSignature());
		System.out.println(
				"Moreover this method takes two params as input one is string and another is int and they are as follows: \n");

		Object[] args = jp.getArgs();
		for (int i = 0; i < args.length; i++) {
			System.out.println(i+1 + ". " + args[i]);
		}
	}
}
