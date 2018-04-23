package org.kishan_udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String args[])
	{
		//ClassPathXmlApplicationContext
		//load the Spring configuration file i.e(.xml file)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//retrieve bean Spring Container
		Coach theCoach = context.getBean("Baseball",Coach.class);
		
		//call methods related to bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context()		
		context.close();
		
		//similar to javabrains
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Coach theCoach = (Coach)context.getBean("Baseball");
		System.out.println(theCoach.getDailyWorkout());*/
	}

}
