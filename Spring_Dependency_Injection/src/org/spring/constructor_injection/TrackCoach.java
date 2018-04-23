package org.spring.constructor_injection;

public class TrackCoach implements Coach{
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a  5K on Track";
	}

	@Override 
	public String getDailyFortune() {
		return "Just Do it "+fortuneService.getFortune();
	}
}
