package org.spring.setter_injection;

public class BaseBallCoach implements Coach{

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice Session of BaseBall";
	}

	//not needed
	/*public FortuneService getFortuneService() {
		return fortuneService;
	}*/

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BaseBall Coach : inside setter method-setFortuneService "+ fortuneService);

		this.fortuneService = fortuneService;
	}

	public BaseBallCoach() {
System.out.println("BaseBall Coach : inside no-arg Constructor");
}
	
	@Override
	public String getDailyFortune() {
				return fortuneService.getFortune();
	}


}
