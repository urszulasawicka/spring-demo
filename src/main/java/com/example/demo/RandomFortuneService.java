package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private Random myRandom = new Random();
	
	private String fortunes;
	
	private List<String> data;
	
	@Override
	public String getFortune() {
		return data.get(myRandom.nextInt(data.size()));
	}

	public String getFortunes() {
		return fortunes;
	}

	public void setFortunes(String fortunes) {
		this.fortunes = fortunes;
		Optional<String[]> listOptional = Optional.of(fortunes.split(","));
		data = Arrays.asList(listOptional.get());
	}

}
