package com.springboot.katafirstapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springboot.katafirstapp.models.BowlingGame;

@Configuration
@ComponentScan("com.springboot.katafirstapp.config")
public class ApplicationConfig {
	
	@Bean
	BowlingGame bowlingGame() {
		return new BowlingGame();
	}

}
