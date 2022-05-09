package com.edu;

public class Student 
{
	int sid;
	String sname;
	

	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public void display()
	{
		System.out.println("student id:"+sid);
		System.out.println("student name:"+sname);
	}

}
