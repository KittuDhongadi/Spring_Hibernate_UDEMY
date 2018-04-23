package org.spring.bean_scope;

public class BaseBallCoach implements Coach{
	//define a private field for dependency
/*
	private int time;
	private String day;
	
	//define Constructor
	public BaseBallCoach(int time) {
		this.time=time;
	}
	public BaseBallCoach(int time, String day) {
		this.time=time;
		this.day=day;
	}

	@Override
	public String getDailyWorkout() {
		return "time to be spent on Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		//return fortuneService.getFortune();
		return "Get Daily BaseBall Fortune";
	}*/
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService thefortuneService) {
	fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minute's on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
