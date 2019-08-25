package com.example.test01.services;

import com.example.test01.model.Rates;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.*;

@Service
public class RatesService {
	
	public Map<String,String> listAllRates(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test-bean.xml");
	    Rates objA = (Rates) context.getBean("getRates");
	      
		return objA.getMapRates();
	}
	
	public String AmountConverted(String baseCurrency, String convertCurrency, String bAmount) {
		Rates r = new Rates();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test-bean.xml");
	    r = (Rates) context.getBean("getRates");
	    
		r.setBaseCurrency(baseCurrency);
		r.setConvertCurrency(convertCurrency);
		r.setBaseAmount(Double.parseDouble(bAmount));
		
		//get baseCurrency and convertCurrency type
		String baseRate = r.getMapRates().get(baseCurrency);
		String convRate = r.getMapRates().get(convertCurrency);
		
		Double chgRate=changeRate(baseCurrency, baseRate,convertCurrency, convRate);		
		Double rValue = Double.parseDouble(bAmount) * chgRate;
		
		DecimalFormat fmt = new DecimalFormat("##.####");
		
		return fmt.format(rValue).toString();
	}
	
	private Double changeRate(String baseCurr, String baseRate, String convCurr, String convRate) {
		
		Double returnRate = 0.0;
		
		if(baseCurr == "SGD") {
			returnRate = Double.parseDouble(convRate);
		}else {
			returnRate = Double.parseDouble(convRate) / Double.parseDouble(baseRate);
		}
		
		return returnRate;
	}

}
