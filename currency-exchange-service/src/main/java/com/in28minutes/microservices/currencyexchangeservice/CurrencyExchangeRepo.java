package com.in28minutes.microservices.currencyexchangeservice;
import org.springframework.data.jpa.repository.JpaRepository;
import com.in28minutes.microservices.entity.CurrencyExchange;

public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
