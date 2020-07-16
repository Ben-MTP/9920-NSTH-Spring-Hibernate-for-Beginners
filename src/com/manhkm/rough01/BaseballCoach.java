package com.manhkm.rough01;
/*
 * Date: 11/07/2020
 * Author: ManhKM
 * Hỗ trợ cho việc tiếp nhận yêu cầu từ MyApp gọi đến
 * Đưa ra quyết định trả về giá trị cho MyApp khi có yêu cầu gọi đến
 * */
public class BaseballCoach implements Coach{
	
	//define a private field for the dependency:
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection:
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	//function:
	@Override
	public String getDailyWorkout() {
		return "Tap danh bong ban 30p nhe";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune:
		return fortuneService.getDailyFortune();
	}
}
