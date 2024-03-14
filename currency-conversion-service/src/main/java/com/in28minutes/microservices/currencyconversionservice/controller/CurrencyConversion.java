package com.in28minutes.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

public class CurrencyConversion {
   private Long id;
   private String from;
   private String to;
   private BigDecimal quantity;
   private BigDecimal conversionMultiple;
   private BigDecimal totalcalculatedAmount;
   private String environment;
public CurrencyConversion() {
	super();
}
public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
		BigDecimal totalcalculatedAmount, String environment) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.quantity = quantity;
	this.conversionMultiple = conversionMultiple;
	this.totalcalculatedAmount = totalcalculatedAmount;
	this.environment = environment;
}
/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @return the from
 */
public String getFrom() {
	return from;
}
/**
 * @param from the from to set
 */
public void setFrom(String from) {
	this.from = from;
}
/**
 * @return the to
 */
public String getTo() {
	return to;
}
/**
 * @param to the to to set
 */
public void setTo(String to) {
	this.to = to;
}
/**
 * @return the quantity
 */
public BigDecimal getQuantity() {
	return quantity;
}
/**
 * @param quantity the quantity to set
 */
public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
}
/**
 * @return the conversionMultiple
 */
public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}
/**
 * @param conversionMultiple the conversionMultiple to set
 */
public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}
/**
 * @return the totalcalculatedAmount
 */
public BigDecimal getTotalcalculatedAmount() {
	return totalcalculatedAmount;
}
/**
 * @param totalcalculatedAmount the totalcalculatedAmount to set
 */
public void setTotalcalculatedAmount(BigDecimal totalcalculatedAmount) {
	this.totalcalculatedAmount = totalcalculatedAmount;
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
