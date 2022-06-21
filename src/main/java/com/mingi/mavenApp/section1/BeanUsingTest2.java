package com.mingi.mavenApp.section1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUsingTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di3.xml");
 
		Person p1 = ctx.getBean("person", Person.class);
		Person p2 = ctx.getBean("person2", Person.class);
		System.out.println(p1); //autowire="byName"
		System.out.println(p2); //autowire="byType"

	}

}
