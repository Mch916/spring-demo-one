package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public FootballCoach() {
		System.out.println("FootballCoach: inside no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Shoot 100 times!";
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("FootballCoach: inside setter - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("FootballCoach: inside setter - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("FootballCoach: inside setter - setTeam");
		this.team = team;
	}

}
