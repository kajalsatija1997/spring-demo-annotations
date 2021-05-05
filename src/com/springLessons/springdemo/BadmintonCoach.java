package com.springLessons.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class BadmintonCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public BadmintonCoach() {
		System.out.println("Inside BadmintonCoach default constructor");
	}
	
	//For Method Injection & Setter injection
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println("Inside BadmintonCoach setFortuneService");
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice the high shots";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
