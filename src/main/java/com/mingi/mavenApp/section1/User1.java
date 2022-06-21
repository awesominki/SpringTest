package com.mingi.mavenApp.section1;

public class User1 {
	public static void main(String[] args) {
		TV tv = TVFactory.makeTV("samsung");
		tv.powerOn();
		tv.powerOff();
	}
}
