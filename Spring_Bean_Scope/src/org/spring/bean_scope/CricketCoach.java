package org.spring.bean_scope;

public class CricketCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Catching Practice";
	}

	@Override
	public String getDailyFortune() {
		return "get a CricketCoach Fortune";
	}

}
