package com.example.test01.controllers;

import com.example.test01.model.Rates;
import com.example.test01.services.RatesService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

//@RequestMapping(value="v1/organizations/{organizationId}/licenses")
//@RequestMapping(value="v1/baseCurrency/{baseCurrency}/convertCurrency/{convertCurrency}/baseAmount/{baseAmount}/convertedAmount")

@RestController
@RequestMapping(value="/")
public class RatesController {

	private RatesService rateservice;
	
	@RequestMapping(value="/baseCurrency/{baseCurrency}/convertCurrency/{convertCurrency}/baseAmount/{baseAmount}")
	public String convertBaseAmount(@PathVariable("baseCurrency") String bCurr,
            @PathVariable("convertCurrency") String convertCurr, @PathVariable("baseAmount") String bAmount) {
		
		rateservice = new RatesService();
		return rateservice.AmountConverted(bCurr, convertCurr, bAmount);
	}
	
	@RequestMapping(value="/listRates",method = RequestMethod.GET)
	public Map<String,String> listRates() {
		rateservice = new RatesService();
		return rateservice.listAllRates();
	}

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home() {
		
		return "Hello from Service running at port";
	}
	
}
