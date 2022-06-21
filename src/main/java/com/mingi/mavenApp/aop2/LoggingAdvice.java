package com.mingi.mavenApp.aop2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Advice : 보조업무
@Component
@Aspect // advice + pointcut
public class LoggingAdvice{
	@Pointcut("execution(* add(int)) || execution(* add(int, int))")
	public void targetMethod() {
		
	}
	
	@Around("targetMethod()")
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("주업무 전에 수행 : " + jp.getSignature().getName() + "호출전");
		Object obj = jp.proceed(); // 주업무 호출하기
		System.out.println("주업무 후에 수행 : " + jp.getSignature().getName() + "호출후");
		
		
		return obj;
	}
	
	@Before("targetMethod()")
	public void test(JoinPoint jp) {
		System.out.println("before : " + jp.getSignature().getName());
	}
	
	@After("targetMethod()")
	public void test2(JoinPoint jp) {
		System.out.println("after : " + jp.getSignature().getName());
	}
}