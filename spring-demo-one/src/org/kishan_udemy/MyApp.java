package org.kishan_udemy;

public class MyApp {

	public static void main(String[] args) 
	{
		
		//this is just simple creating instance of the BaseballCoach Class
		/*
		BaseballCoach thecoach = new BaseballCoach();
		System.out.println(thecoach.getDailyWorkout());*/
		
		//now we use code to interface
		
		//we create instance of the Interface Coach for implementing the methods from interface
		
		Coach thecoach = new BaseballCoach();
		System.out.println(thecoach.getDailyWorkout());
		
	}

}
