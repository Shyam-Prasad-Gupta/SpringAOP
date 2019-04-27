package com.shyam.springaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspectAfterFinally {
	
	@After(value="execution(public * *(..))")
	public void afterFinallyDemo() {
		
		System.out.println("##########Writing from After Finally advice############");
	}
	

}
