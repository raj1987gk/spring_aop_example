package com.example.demo.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopAdvice {

//	@Before("execution(* com.example.demo.service.AopServive.getAccountBalance(..))")
//	public void executeLogAdvice(JoinPoint joinPoint) {
//		System.err.println("@Before advice");
//	}
	

	@Around("execution(* com.example.demo.service.AopServive.getAccountBalance(..))")
	public Object executeLogAdviceAfter(ProceedingJoinPoint joinPoint) {
		Object value=null;
		try {
			value = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.err.println("@Around advice");
		return value;
	}
	
//	
//	@Around("execution(* com.example.demo.service.AopServive.getAccountBalance(..))")
//	public void executeLogAdviceAround(JoinPoint joinPoint) {
//		System.err.println("@@Around advice");
//	}
//	
	
}
