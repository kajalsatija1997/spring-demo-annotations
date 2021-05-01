package com.springLessons.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice the high shots";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
