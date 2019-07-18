package com.pack.springdemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		Resource resource = new ClassPathResource("beans.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		

		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");

		Scanner sc = new Scanner(System.in);
		System.out.println("-------------");
		System.out.println(" MAN ");
		System.out.println(" WOMAN ");
		System.out.println("-------------");
		System.out.println("Enter choice :- ");
		String op = sc.next();
		
		if (op.equals("man") || op.equals("woman")) {
			Human obj = (Human) factory.getBean(op);
			System.out.println(obj);
		}
		
		System.out.println("------------------");
		
		Address address = (Address) factory.getBean("m_address");
		System.out.println(address);

		sc.close();
	}
}
