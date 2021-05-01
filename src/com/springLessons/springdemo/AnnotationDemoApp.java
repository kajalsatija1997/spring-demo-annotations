package com.springLessons.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read Spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the annotated bean  
		//For explicit bean id 
		/* Coach theCoach= context.getBean("thatSillyCoach",Coach.class); */
		
		//For default bean id 
		Coach theCoach= context.getBean("tennisCoach",Coach.class);
		
		//Display method on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		//Display getDailyFortune method with autowiring -DI
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
