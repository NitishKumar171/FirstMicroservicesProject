package com.microservices.currenciesexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurrenciesExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrenciesExchangeServiceApplication.class, args);
		System.out.println("Microservices project started...");
	}

}
