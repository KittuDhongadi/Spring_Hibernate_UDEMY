package org.spring.JavaConfiguration_88_89;

import org.springframework.stereotype.Component;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Sad Day";
	}

}
