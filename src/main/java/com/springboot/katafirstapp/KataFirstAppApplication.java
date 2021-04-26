package com.springboot.katafirstapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springboot.katafirstapp.config.ApplicationConfig;
import com.springboot.katafirstapp.models.BowlingGame;

@SpringBootApplication
public class KataFirstAppApplication {

	public static void main(String[] args) {
		final ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		final BowlingGame game = ctx.getBean(BowlingGame.class);
	}
}
