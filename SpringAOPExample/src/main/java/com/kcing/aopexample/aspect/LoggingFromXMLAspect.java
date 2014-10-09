package com.kcing.aopexample.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingFromXMLAspect {

	
	
	 public Object xmlAroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
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
	 
	 public void xmlBeforeSetMethod() {
		 System.out.println("Before Set Method is called:Argument:");
	 }
}
