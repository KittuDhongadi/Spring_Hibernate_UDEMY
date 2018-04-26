package org.spring.InjectingValuesFromPropertyFile_90_91_92;

import org.springframework.stereotype.Component;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Sad Day";
	}

}
