package com.accenture.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private String fname;
	private String lname;
	
	public Person() {}
	
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
