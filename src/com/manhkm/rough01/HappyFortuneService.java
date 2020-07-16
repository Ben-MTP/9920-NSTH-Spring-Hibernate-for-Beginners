package com.manhkm.rough01;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is your happy day!";
	}

}
