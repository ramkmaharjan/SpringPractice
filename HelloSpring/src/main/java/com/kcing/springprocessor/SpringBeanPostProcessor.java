package com.kcing.springprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SpringBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Pre Process:"+beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Post Process:"+beanName);
		return bean;
	}

}
