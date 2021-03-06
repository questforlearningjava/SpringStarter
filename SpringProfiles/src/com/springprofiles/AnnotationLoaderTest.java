package com.springprofiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationLoaderTest {
	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(DevProfileConfig.class,ProdProfileConfig.class,FreeProfileConfig.class);
		Profiler p = (Profiler)context.getBean("profile");
		p.printProfileName();
	}
}
