package com.pack.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
//	@Before("execution (* com.pack.springaop.service.*.*(..))")
//	public void beforeService() {
//		System.out.println("Logging Called before Service");
//	}
	
	@Around("execution (* com.pack.springaop.service.*.*(..))")
	public void beforeService(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Logging Called Around Before Service");
		pjp.proceed();
		System.out.println("Logging Called Around After Service");
	}
}
