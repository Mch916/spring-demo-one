package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneSevice;
	
	
	
	public BaseballCoach(FortuneService fortuneSevice) {
		
		this.fortuneSevice = fortuneSevice;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneSevice.getFortune();
	}
}







