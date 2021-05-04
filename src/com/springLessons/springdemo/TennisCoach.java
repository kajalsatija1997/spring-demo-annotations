package com.springLessons.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//For explicit bean id 
/*@Component("thatSillyCoach")*/

//For default bean id 
@Component
public class TennisCoach implements Coach {

	//Inject property file values
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//For field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//For constructor injection
	
	/*
	 * @Autowired public TennisCoach(FortuneService thisFortuneService) {
	 * fortuneService = thisFortuneService; }
	 */
	
	//For setter Injection
	
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
