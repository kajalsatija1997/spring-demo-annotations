package com.springLessons.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		
		//Load the Spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		//Result to check whetherboth instances pointing to same location
		boolean result= (theCoach==alphaCoach);
		
		System.out.println("Beans pointing to same memory location: "+result);
		
		System.out.println("Memory location for theCoach: "+theCoach);
		
		System.out.println("Memory location for alphaCoach: "+alphaCoach);
		
		//Closing the context
		context.close();
		

	}

}
