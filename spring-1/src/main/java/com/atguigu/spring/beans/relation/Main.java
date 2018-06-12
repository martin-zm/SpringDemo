package com.atguigu.spring.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.autowire.Address;
import com.atguigu.spring.beans.autowire.Person;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans-relation.xml");
		
		Address address = (Address) cxt.getBean("address3");		
		System.out.println(address);
		
		Address address2 = (Address) cxt.getBean("address2");		
		System.out.println(address2);
		
		Person person = (Person) cxt.getBean("person");
		System.out.println(person);
	}	
}
