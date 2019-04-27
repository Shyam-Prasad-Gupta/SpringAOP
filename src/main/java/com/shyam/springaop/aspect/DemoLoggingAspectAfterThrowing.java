package com.shyam.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspectAfterThrowing {
	
	//@AfterThrowing("execution(public * *(..))")
	//@AfterThrowing(pointcut="execution(public * *(..))")
	@AfterThrowing(pointcut="execution(public * *(..))", throwing="throwEx")
	public void logTheThrownException(JoinPoint jp, Throwable throwEx) {
		System.out.println("############Greetings from the After Throwing Aspect############");
		System.out.println(throwEx);
		System.out.println("Method is: " + jp.getSignature().getName() + "\n" + "Method arguments are: " + jp.getArgs().toString());
		
	}

}
