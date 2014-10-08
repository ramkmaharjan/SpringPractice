package com.kcing.aopexample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	// @Before("execution(public void draw())")
	// @Before("execution(public void com.kcing.aopexample.model.Circle.draw())")
	// @Before("execution(public * get*())")
	// @Before("execution(* get*(*))") // call (method having one or many argument but any type
	// @Before("execution(public * get*(..))") //call whether  argument exists or not.
	// @Before("execution (* com.kcing.aopexample.model.*.get*(..))")
	
	/*
	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice run. Draw method is called");
	}
	 */
	 @Before("circlePointCutsOnly()")
	 public void secondAdvice(JoinPoint joinPoint) {
	//	 System.out.println("JoinPoint:" + joinPoint.toString());
		// System.out.println("JoinPoint:" + joinPoint.getTarget());
	 }
	 
//	@Before("circleAsArgsMethod()")
//	 public void printCircleArgs() {
//		System.out.println("Method with circle arg is called");
//	}
	 
	// @After("args(name)")
	 // @AfterReturning(pointcut="args(name)",returning="returnString")
	// @AfterThrowing("args(name)")
	  @AfterThrowing(pointcut="args(name)",throwing="ex")
	 public void printCircleArgs(String name,Object ex) {
//		  System.out.println("Method with circle arg is called:" + name);
		  
	//	System.out.println("Method with circle arg is called:" + name +": Return val:" + returnString);
		  System.out.println("Method with circle arg is called:" + name +": Exception" + ex);
	 }
	@Pointcut("execution(* get*())")
	 public void allGetters() {}
	 
	 /*Include all methods from Circle class */
	// @Pointcut("execution(* *com.kcing.aopexample.model.Circle.*(..))")
	 @Pointcut("within(com.kcing.aopexample.model.Circle)")
	 // @Pointcut("within(com.kcing.aopexample.model..*)") //RootPackage or subpackages (..)
	 public void circlePointCutsOnly() {}
	 
	// @Pointcut("args(com.kcing.aopexample.model.Circle)")
	 @Pointcut("args(java.lang.String)") //args(String)
	 public void circleAsArgsMethod(){}
	 
	 //Combining pointcuts
//	 @Before("allGetters() && circlePointCutsOnly()")
//		public void loggingAdvice() {
//			System.out.println("Advice run. Draw method is called");
//	}
	 @Around("allGetters()")
	// public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
	 public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		 System.out.println("Around advice(Before)"); 
		try {
			returnValue= proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Around advice(After)"); 
		return returnValue;
	 }
}
