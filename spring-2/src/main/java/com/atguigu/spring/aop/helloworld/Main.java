package com.atguigu.spring.aop.helloworld;

public class Main {
	public static void main(String[] args) {
		
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		System.out.println(proxy.getClass().getName());
		int result = proxy.add(1, 2);
		System.out.println("-->" + result);
		
		result = proxy.div(4, 2);
		System.out.println("-->" + result);
	}
}
