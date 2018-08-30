package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach theCoach = new TrackCoach();
		
		TestCoach test = new TestCoach("Test!");
		
		TestCoach test2 = new TestChildCoach("Test2!", "child test2");
		
		
		TestChildCoach test3 =new TestChildCoach("Test3!", "child test3");
		
		
		//use the object
		System.out.println(test.getMsg() + test.getChildMsg());
		
		System.out.println(test2.getMsg() + test2.getChildMsg());
		
		System.out.println(test3.getMsg() + test3.getChildMsg());
	}

}
