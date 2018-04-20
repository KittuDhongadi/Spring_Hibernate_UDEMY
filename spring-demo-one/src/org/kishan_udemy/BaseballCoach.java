package org.kishan_udemy;

public class BaseballCoach implements Coach 
{
	@Override
	//we override the method in Coach Interface
	public String getDailyWorkout()
	{
		return "spend 30minutes on batting practice";
	}

}
