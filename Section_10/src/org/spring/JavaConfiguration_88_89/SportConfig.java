package org.spring.JavaConfiguration_88_89;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	//this method sadFortuneService() name will be Bean ID
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}

}
