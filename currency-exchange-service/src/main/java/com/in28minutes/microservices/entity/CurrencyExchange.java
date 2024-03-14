package com.in28minutes.microservices.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {
 @Id	
  private long id;
 @Column(name ="currency_from")
  private String from;
 @Column(name ="currency_to")
  private String to;
  private BigDecimal conversionMultiple;
  private String environment;
  
public CurrencyExchange() {
	super();
}
public CurrencyExchange(long id, String from, String to, BigDecimal conversionMultiple) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.conversionMultiple = conversionMultiple;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}

public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}
/**
 * @return the environment
 */
public String getEnvironment() {
	return environment;
}
/**
 * @param environment the environment to set
 */
public void setEnvironment(String environment) {
	this.environment = environment;
}
  
  
}
