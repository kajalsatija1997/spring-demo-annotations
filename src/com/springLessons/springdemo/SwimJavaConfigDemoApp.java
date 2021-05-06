package com.springLessons.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read Spring config java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
	
		
		//For default bean id 
		SwimCoach theCoach= context.getBean("swimCoach",SwimCoach.class);
		
		//Display method on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		//Display getDailyFortune method with autowiring -DI
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
