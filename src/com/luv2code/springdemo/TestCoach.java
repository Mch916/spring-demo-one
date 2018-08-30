package com.luv2code.springdemo;

public class TestCoach {
	private String msg;
	
	private String childMsg;
	
	public String getChildMsg() {
		return childMsg;
	}

	public void setChildMsg(String childMsg) {
		this.childMsg = childMsg;
	}
	
	
	public TestCoach(String msg) {
		System.out.println("TestCoach: Constructor");
		this.msg = msg;
		this.childMsg = "default child msg";
	}


	public String getMsg() {
		return msg;
	}
	
	
}
