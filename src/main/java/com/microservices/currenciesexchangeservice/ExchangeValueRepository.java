package com.microservices.currenciesexchangeservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository  extends JpaRepository<ExchangeValue, Integer>{
	
	public ExchangeValue findByFromAndTo(String from,String to);
	public List<ExchangeValue> findAll();

}
