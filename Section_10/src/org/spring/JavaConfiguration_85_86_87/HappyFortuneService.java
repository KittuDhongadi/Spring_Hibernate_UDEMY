package org.spring.JavaConfiguration_85_86_87;


import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Your Lucky Day!";
	}

}

