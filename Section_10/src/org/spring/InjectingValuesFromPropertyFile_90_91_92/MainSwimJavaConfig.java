package org.spring.InjectingValuesFromPropertyFile_90_91_92;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSwimJavaConfig {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
					
		//call our new Swim Coach methods .... has the props values injected
		System.out.println("Email : "+theCoach.getEmail());
		System.out.println("Email : "+theCoach.getTeam());

		//call our new Swim Coach methods .... has the propes values injected
		
		// close the context
		context.close();
	}
}


