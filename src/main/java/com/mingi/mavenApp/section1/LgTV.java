package com.mingi.mavenApp.section1;

public class LgTV implements TV{
	public void turnOn() {
		System.out.println(this.getClass().getSimpleName() + "켠다");
	}
	public void turnOff() {
		System.out.println(this.getClass().getSimpleName() + "끈다");
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + "켠다");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + "끈다");
	}
}
