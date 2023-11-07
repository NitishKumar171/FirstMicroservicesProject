package com.microservices.currenciesexchangeservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrenciesExchangeController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository exchangerepository;
	

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue( @PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeVal= exchangerepository.findByFromAndTo(from, to);
		exchangeVal.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return exchangeVal;
	}
	
	
	
	
}
