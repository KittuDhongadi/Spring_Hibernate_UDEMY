package org.spring.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Coach coach=(Coach)context.getBean("Coach");
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getDailyWorkout());
		
	}

}
