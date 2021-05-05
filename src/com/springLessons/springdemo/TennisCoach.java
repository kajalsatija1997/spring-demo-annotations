package com.springLessons.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//For explicit bean id 
/*@Component("thatSillyCoach")*/

//For default bean id 
@Component
@Scope("prototype")
public class TennisCoach implements Coach,DisposableBean {

	public TennisCoach() {
		System.out.println("Default constructor: TennisCoach : called");
	}

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

	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("In doMyStartupStuff() method in TennisCoach: @PostConstruct.");
	}
	
	@PreDestroy
	public void doMyCleanStuff()
	{
		System.out.println("In doMyCleanStuff() method in TennisCoach: @PreDestroy.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//Destroy prototype scoped beans
	@Override
	public void destroy() throws Exception {
		System.out.println("In destroy() method of Disposablebean interface for prototype scoped beans.");
	}

}
