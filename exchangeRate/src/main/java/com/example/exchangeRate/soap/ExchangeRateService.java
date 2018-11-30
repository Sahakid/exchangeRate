package com.example.exchangeRate.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.exchangeRate.bus.ExchangeRateImpl;
import com.example.exchangeRate.model.ExchangeRate;

@WebService
public class ExchangeRateService {
	ExchangeRateImpl cc = new ExchangeRateImpl();
	
	@WebMethod
	public ArrayList<ExchangeRate> getCurrencyResult (String denomination) {
		return cc.getResult(denomination);
	}
}
