package com.manhkm.rough01;

public class MyApp {

	public static void main(String[] args) {
		//Create Object:
		Coach theCoach = new TrackCoach();
		//Using method:
		String result_action = theCoach.getDailyWorkout();
		System.out.println(result_action);
	}

}
