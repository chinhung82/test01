package com.example.test01.model;

import java.util.Map;

public class Rates {
	
	private Map<String, String> mapRates;
	
	Double baseAmount;
	String baseCurrency;
	String convertCurrency;	
	Double convertedAmount;
	
	
	public Map<String, String> getMapRates() {
		return mapRates;
	}
	public void setMapRates(Map<String, String> mapRates) {
		this.mapRates = mapRates;
	}

	public Double getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(Double baseAmount) {
		this.baseAmount = baseAmount;
	}
	public String getBaseCurrency() {
		return baseCurrency;
	}
	public Double getConvertedAmount() {
		return convertedAmount;
	}
	public void setConvertedAmount(Double convertedAmount) {
		this.convertedAmount = convertedAmount;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	public String getConvertCurrency() {
		return convertCurrency;
	}
	public void setConvertCurrency(String convertCurrency) {
		this.convertCurrency = convertCurrency;
	}
	
}
