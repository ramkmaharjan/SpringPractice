package com.kcing.aopexample.aspect;

import org.aspectj.lang.JoinPoint;
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
		 System.out.println("JoinPoint:" + joinPoint.getTarget());
	 }
	 
//	@Before("circleAsArgsMethod()")
//	 public void printCircleArgs() {
//		System.out.println("Method with circle arg is called");
//	}
	 
	 @Before("args(name)")
	 public void printCircleArgs(String name) {
		System.out.println("Method with circle arg is called:" + name);
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
//		}
}
