package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ClassPathXmlApplicationContext singletonScopeApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = singletonScopeApplicationContext.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		CricketCoach cricketCoach = singletonScopeApplicationContext.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		singletonScopeApplicationContext.close();
		
		ClassPathXmlApplicationContext beanScopeApplicationContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");		
	
		Coach beanScopeCoach = beanScopeApplicationContext.getBean("myCoach", Coach.class);
		Coach alphaBeanScopeCoach = beanScopeApplicationContext.getBean("myCoach", Coach.class);
		
		System.out.println("Pointing to the same object: " + (beanScopeCoach == alphaBeanScopeCoach));
		
		beanScopeApplicationContext.close();
	}

}
