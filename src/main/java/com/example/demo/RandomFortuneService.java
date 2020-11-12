package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private Random myRandom = new Random();
	
	private String[] data = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	@Override
	public String getFortune() {
		return data[myRandom.nextInt(data.length)];
	}

}
