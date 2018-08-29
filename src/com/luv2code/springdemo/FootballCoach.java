package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	public FootballCoach() {
		System.out.println("FootballCoach: inside no-arg constructor");
	}
	
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		
		return "Shoot 100 times!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("FootballCoach: inside setter");
		this.fortuneService = fortuneService;
	}
	
	

}
