package com.springLessons.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.springLessons.springdemo")
public class SportConfig {
	
	//Created a bean for sadFortuneService
	@Bean 
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	
	//DI- Constructor Injection
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}

}
