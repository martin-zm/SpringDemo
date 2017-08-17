package com.atguigu.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * ��̬����������ֱ�ӵ���ĳ����ľ�̬�����Ϳ��Է���Bean��ʵ��
 */
public class StaticCarFactory {

	private static Map<String, Car> cars = new HashMap<String, Car>();
	
	static {
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("audi", 400000));
	}
	
	//��̬��������.
	public static Car getCar(String name) {
		return cars.get(name);		
	}
}
