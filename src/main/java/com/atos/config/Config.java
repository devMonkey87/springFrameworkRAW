package com.atos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public void metodoRandom() {

		System.out.println("Llamado a metodo de mierda");
	}

}
