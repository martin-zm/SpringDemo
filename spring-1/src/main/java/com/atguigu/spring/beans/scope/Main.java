package com.atguigu.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.autowire.Address;
import com.atguigu.spring.beans.autowire.Car;
import com.atguigu.spring.beans.autowire.Person;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Car car = (Car) cxt.getBean("car");
		Car car2 = (Car) cxt.getBean("car");
		
		System.out.println(car == car2);
	}	
}
