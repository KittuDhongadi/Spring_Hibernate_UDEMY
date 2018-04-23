package org.spring.bean_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {
	
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//retrieve bean Spring Container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);

		boolean result = (theCoach==alphaCoach);
		
		System.out.println("Pointing to same Object : "+result);
		 
		System.out.println("Memory location for theCoach : "+theCoach);
		
		System.out.println("Memory location for alphaCoach : "+alphaCoach);

		//close the context()		
		context.close();
		}

}
