package com.mingi.mavenApp.section1;

import java.util.List;
import java.util.Map;

import com.mingi.mavenApp.section2.Car;

public class Person {

	private String name;
	private String phone;
	private Car car;
	
	private List<String> major;
	private List<License> 자격증들;
	private Map<String, Book> bookMap;
	

	public Person() {
		System.out.println("default생성자를 이용해서  Person만든다.");
	}

	public Person(String name, String phone, Car car) {
		super();
		this.name = name;
		this.phone = phone;
		this.car = car;
		System.out.println("argument3개가 있는 생성자를 이용해서  Person만든다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName:" + name);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("setPhone:" + phone);
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
		System.out.println("setCar:" + car);
	}

	public List<String> getMajor() {
		return major;
	}

	public void setMajor(List<String> major) {
		this.major = major;
	}

	public List<License> get자격증들() {
		return 자격증들;
	}

	public void set자격증들(List<License> 자격증들) {
		this.자격증들 = 자격증들;
	}

	public Map<String, Book> getBookMap() {
		return bookMap;
	}

	public void setBookMap(Map<String, Book> bookMap) {
		this.bookMap = bookMap;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", phone=").append(phone).append(", car=").append(car)
				.append(", major=").append(major).append(", 자격증들=").append(자격증들).append(", bookMap=").append(bookMap)
				.append("]");
		return builder.toString();
	}










	
	

}
