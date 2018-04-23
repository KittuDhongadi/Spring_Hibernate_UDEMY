package org.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAnnotationMain {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//retrieve bean Spring Container
		Coach theCoach = context.getBean("SillyCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		}
}
