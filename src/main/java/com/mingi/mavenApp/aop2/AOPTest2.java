package com.mingi.mavenApp.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop2.xml");
		Calculator cal = ctx.getBean("proxyCal",Calculator.class);
		cal.add(100);
		cal.divide(10, 5);

	}

}
