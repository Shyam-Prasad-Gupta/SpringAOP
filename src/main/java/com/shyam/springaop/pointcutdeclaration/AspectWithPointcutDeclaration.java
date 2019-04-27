package com.shyam.springaop.pointcutdeclaration;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectWithPointcutDeclaration {
	
	//declaring a pointcut expression and we use the method name wherever we want to apply this expression
	@Pointcut("execution(public boolean delete*(String))")
	private void beforeDeleteUserPointcut() {}
	
	//applying the pointcut express using pointcut declaration
	@Before("beforeDeleteUserPointcut()")
	public void executeBeforeDeletingUser() {
		System.out.println("Before deleting user: <<Pointcut Declaration>>");
	}
	

}
