package com.shyam.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.shyam.springaop.dao.User;

@Aspect
@Component
public class DemoLoggingAspectAfterReturning {

	// this advice is called one's pointcut expression is matched and the target
	// object method returns a value
	// @AfterReturning("execution(public * getUser(..))")
	// @AfterReturning(pointcut="execution(public * getUser(..))")
	// @AfterReturning(value="execution(public * getUser(..))", returning="result")
	@AfterReturning(pointcut = "execution(public * getUser(..))", returning = "result")
	public void afterReturningAdvice(JoinPoint jpoint, Object result) {//result in the method declaration and the name of variable in returning must be same

		User usr = (User)result;
		System.out.println("Executing afterreturning in method: " + jpoint.getSignature());
		System.out.println("logging from the after returning method");
		System.out.println("Returned user is: " + ((User)result).toString());
		
		//we can post process the data before returning it to the caller by dob we can calculate the age and add it to the user
		usr.setName(usr.getName().toUpperCase());
	}

}
