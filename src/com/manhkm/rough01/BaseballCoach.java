package com.manhkm.rough01;
/*
 * Date: 11/07/2020
 * Author: ManhKM
 * Hỗ trợ cho việc tiếp nhận yêu cầu từ MyApp gọi đến
 * Đưa ra quyết định trả về giá trị cho MyApp khi có yêu cầu gọi đến
 * */
public class BaseballCoach implements Coach{
	//function:
	@Override
	public String getDailyWorkout() {
		return "Tap danh bong ban 30p nhe";
	}
}
