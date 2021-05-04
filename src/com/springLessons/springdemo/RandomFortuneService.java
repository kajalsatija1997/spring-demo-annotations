package com.springLessons.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create and array of strings
	private String[] fortunes= {"Today you will run into difficulties :-(","Today is your lucky day!",
			"Today you will hear some good news :-)","Today is your bad day! Sorry!"};
	
	//create a random number generator
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		
		int randomFortune=myRandom.nextInt(fortunes.length);
		String fortune=fortunes[randomFortune];
		return fortune;
	}

}
