package org.spring.JavaConfiguration_85_86_87;

import org.springframework.stereotype.Component;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Sad Day";
	}

}
