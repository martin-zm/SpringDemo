package com.atguigu.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans-autowire.xml");
		
		Person person = (Person) cxt.getBean("person");
		
		System.out.println(person);
	}	
}
