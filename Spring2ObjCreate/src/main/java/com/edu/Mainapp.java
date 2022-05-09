package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Student st=(Student) ctx.getBean("sot");
		Course co=(Course) ctx.getBean("cos");
		System.out.println("student details");
		st.setSid(1);
		st.setSname("tharani");
		st.display();
		System.out.println("course details");
	    co.courseDisplay();

	}

}
