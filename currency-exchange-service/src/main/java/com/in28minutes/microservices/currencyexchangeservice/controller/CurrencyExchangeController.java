	package com.in28minutes.microservices.currencyexchangeservice.controller;
	
	import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.core.env.Environment;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;	
	import com.in28minutes.microservices.currencyexchangeservice.CurrencyExchangeRepo;
	import com.in28minutes.microservices.entity.CurrencyExchange;
	
	@RestController
	public class CurrencyExchangeController {
		
	private Logger log = LoggerFactory.getLogger(CurrencyExchangeController.class);
	@Autowired	
	   private CurrencyExchangeRepo repository;
		
		@Autowired
		private Environment environment;
	   @GetMapping("/currency-exchange/from/{from}/to/{to}")	
	   public CurrencyExchange retrieveExchange(@PathVariable String from , @PathVariable String to) {
		   
			/*
			 * CurrencyExchange currencyExchange = new CurrencyExchange(1000l , from , to ,
			 * BigDecimal.valueOf(50))
			 */
		     log.info("retrieveExchangeValue called with {} to {}" , from , to);
		    CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
		     if(currencyExchange == null) {
		    	 throw new RuntimeException("unable to find data for " +from +" to " +to);
		     }
		    String port = environment.getProperty("local.server.port");
		   currencyExchange.setEnvironment(port);
		   
		return currencyExchange;
	   }
	}
