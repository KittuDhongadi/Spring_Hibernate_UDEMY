package org.spring.InjectingValuesFromPropertyFile_90_91_92;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
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
