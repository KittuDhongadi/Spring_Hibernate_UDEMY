package org.spring.Bean_LifeCycle;

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
	
	
	//user defined code
	public void initialise()
	{
		System.out.println("Initialse method");
	}
	
	public void destroy()
	{
		System.out.println("destroy method");
	}
}
