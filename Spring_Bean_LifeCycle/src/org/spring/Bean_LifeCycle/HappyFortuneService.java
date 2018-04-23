package org.spring.Bean_LifeCycle;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Your Lucky Day!";
	}

}
