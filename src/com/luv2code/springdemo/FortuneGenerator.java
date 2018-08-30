package com.luv2code.springdemo;

import java.util.Random;

public class FortuneGenerator implements FortuneService {

	private String[] fortunes = {
			"Lucky Day",
			"Normal Day",
			"Bad Day"
	};
	
	private Random ran = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[ran.nextInt(fortunes.length)];
	}

}
