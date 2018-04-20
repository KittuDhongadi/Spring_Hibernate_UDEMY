package org.kishan_udemy;

public class TrackCoach implements Coach {

	@Override
	//we Override the method in Interface
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

}
