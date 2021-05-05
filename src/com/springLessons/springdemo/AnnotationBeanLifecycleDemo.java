package com.springLessons.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanLifecycleDemo {

	public static void main(String[] args) {

		//Load the Spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//Retrieve the bean
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		//Call the methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//Closing the context
		context.close();
				
				
	}

}
