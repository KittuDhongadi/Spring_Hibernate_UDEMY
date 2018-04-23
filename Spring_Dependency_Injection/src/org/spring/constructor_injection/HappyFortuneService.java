package org.spring.constructor_injection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Your Lucky Day!";
	}

}
