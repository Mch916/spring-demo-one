package com.luv2code.springdemo;

public class TestChildCoach extends TestCoach {

	

	public TestChildCoach(String msg, String childMsg) {
		super(msg);
		this.setChildMsg(childMsg);
		System.out.println("TestChildCoach: Constructor");
	}

}
