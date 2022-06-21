package com.mingi.mavenApp.section1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class User2UsingSpring {
	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("di1.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		TV tv = (TV)factory.getBean("samsungtv");
//		tv.powerOn();
//		tv.powerOff();
//		System.out.println(tv);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di1.xml");
		TV tv = (TV)context.getBean("samsungtv");
		tv.powerOn();
		tv.powerOff();
		System.out.println(tv);
	}
}
