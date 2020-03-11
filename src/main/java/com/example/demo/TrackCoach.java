package com.example.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: init method");
	}

	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: destroy method");
	}

}
