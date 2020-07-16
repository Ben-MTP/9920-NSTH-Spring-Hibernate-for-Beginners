package com.manhkm.rough01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file:
		/*
		 * Class: ClassPathXmlApplicationContext -> what is this?
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext contextSwim = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive bean from spring container:
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoachSwim = context.getBean("mySwim", Coach.class);
		
		//call methods on the bean:
		System.out.println(theCoachSwim.getDailyWorkout());
		
		//close the context:
		context.close();
	}

}
