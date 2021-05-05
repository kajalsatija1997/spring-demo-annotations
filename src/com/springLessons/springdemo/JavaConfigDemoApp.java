package com.springLessons.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		//read Spring config java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
	
		
		//For default bean id 
		TennisCoach theCoach= context.getBean("tennisCoach",TennisCoach.class);
		
		//Display method on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		//Display getDailyFortune method with autowiring -DI
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
