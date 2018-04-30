package org.spring.InjectingValuesFromPropertyFile_90_91_92;


import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
			};
	
	private Random random=new Random();
	
	
	
	@Override
	public String getFortune() {
		int index=random.nextInt((data.length));
		
		String theFortune = data[index];
		
		return theFortune;
		
	}

}