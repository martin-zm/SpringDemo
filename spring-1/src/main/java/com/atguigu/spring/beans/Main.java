package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*
		//����HelloWorld��һ������
		HelloWorld helloWorld = new HelloWorld();
		//Ϊname���Ը�ֵ
		helloWorld.setName("atguigu");
		*/
		//1. ����Spring��IOC����
		//ApplicationContext����IOC����
		//ClassPathXmlApplicationContext: ��ApplicationContext �ӿڵ�ʵ���ࡣ��ʵ�������·���������������ļ���
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. �������л�ȡBean, getBeanȡ������Ϊxml�ļ�������id
		//����id��λ��IOC�����е�bean
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");		
		//�������ͷ���IOC�����е�Bean,��Ҫ��IOC�����б���ֻ����һ�������͵�Bean
		//HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld);
		
		//3.����hello����
		helloWorld.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		
		Person person = (Person) ctx.getBean("person2");
		System.out.println(person);
	}
}
