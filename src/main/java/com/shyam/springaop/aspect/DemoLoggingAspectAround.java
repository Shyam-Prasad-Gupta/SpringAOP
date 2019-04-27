package com.shyam.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspectAround {

	@Around("execution(* *(..))")
	public Object aroundAdviceDemo(ProceedingJoinPoint pJoinPoint) {

		long startTime = System.currentTimeMillis();
		Object value = null;
		try {
			value = pJoinPoint.proceed();
		} catch (Throwable exp) {
			exp.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken by the method is: " + (endTime - startTime));
		return value;
	}

}
