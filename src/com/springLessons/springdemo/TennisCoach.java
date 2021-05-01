package com.springLessons.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//For explicit bean id 
/*@Component("thatSillyCoach")*/

//For default bean id 
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService thisFortuneService) {
		fortuneService = thisFortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
