package com.gd.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gd.Welcome;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-context.xml");
		Welcome wel =(Welcome)ctx.getBean("wel");
		System.out.println(wel.getMsg());
		

	}

}
