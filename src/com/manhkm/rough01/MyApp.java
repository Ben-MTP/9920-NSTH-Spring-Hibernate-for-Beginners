package com.manhkm.rough01;

public class MyApp {

	public static void main(String[] args) {
		//Create Object:
		Coach theCoach = new TrackCoach();
		//Coach theBasebalCoach = new BaseballCoach();
		Coach theSwimming = new Swimming();
		//Using method:
		String result_action1 = theCoach.getDailyWorkout();
		System.out.println("Result of theCoach: "+result_action1);
		
		//System.out.println("Result of theBasebalCoach: "+theBasebalCoach.getDailyWorkout());
	}

}
