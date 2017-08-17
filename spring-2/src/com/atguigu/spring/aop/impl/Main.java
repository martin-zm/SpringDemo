package com.atguigu.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//1.����spring��IOC����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л�ȡbean��ʵ��
		ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);
		
		//3.ʹ��bean
		int result = arithmeticCalculator.add(3, 6);
		System.out.println("result:" + result);
		
		int result2 = arithmeticCalculator.div(12, 6);
		System.out.println("result:" + result2);
	}
}
