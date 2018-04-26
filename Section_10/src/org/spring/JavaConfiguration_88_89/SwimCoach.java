package org.spring.JavaConfiguration_88_89;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm Up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
