package org.kishan_udemy;

public class MyApp {

	public static void main(String[] args) 
	{
		
		//this is just simple creating instance of the BaseballCoach Class
		//Object Creation
		
		/*BaseballCoach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());*/
		
		//now we use code to interface
		//we create instance of the Interface Coach for implementing the methods from interface
		
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
