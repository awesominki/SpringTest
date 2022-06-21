package com.mingi.mavenApp.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop1.xml");
		Calculator cal = ctx.getBean("proxyCal",Calculator.class);
		cal.add();
		cal.divide(10, 5);

	}

}
