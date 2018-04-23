package org.spring.setter_injection;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice Fast Bowling for 15 Minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public CricketCoach() {
System.out.println("Cricket Coach : inside no-arg Constructor");
}

	//not needed
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	//not needed
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Cricket Coach : inside setter method-setFortuneService "+ fortuneService);
	}
	
}