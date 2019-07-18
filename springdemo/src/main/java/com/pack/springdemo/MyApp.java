package com.pack.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {


	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("roles.xml");
		
		Object obj1 = ctx.getBean("manager");
		Object obj2 = ctx.getBean("manager");
		Object obj3 = ctx.getBean("manager");
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.println("----------------");
		((Manager)obj2).setName("Stinson");
		((Manager)obj3).setName("Ted Mosby");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	
		obj1=null;
		Thread.sleep(1000000);
		System.gc();
		
		
	}

}