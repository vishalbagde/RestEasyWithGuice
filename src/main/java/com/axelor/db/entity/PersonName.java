package com.axelor.db.entity;

import javax.persistence.Embeddable;

@Embeddable
public class PersonName {

	String fname;
	String mname;
	String lname;
		
	public PersonName(String fname, String mname, String lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}
	
	public PersonName() {
		super();
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
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "PersonName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	
	


}
