package com.atguigu.spring.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.autowire.Address;
import com.atguigu.spring.beans.autowire.Car;
import com.atguigu.spring.beans.autowire.Person;

public class Main {
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans-properties.xml");
		
		DataSource dataSource = (DataSource) cxt.getBean("dataSource");
		
		System.out.println(dataSource.getConnection());
	}	
}
