package com.chx.common.utils;

import java.util.Date;



/**
 * 
 * @ClassName: Person 
 * @Description: TODO
 * @author: MACHENIKE
 * @date: 2020年2月28日 上午8:48:58
 */

public class Person {

	private String name;
	private Integer age;
	private String about;
	private Date created;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String name, Integer age, String about, Date created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	
	
	
	
	
	
	
	
}
