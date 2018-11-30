package com.example.exchangeRate.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;

import com.example.exchangeRate.model.*;


public class ExchangeRateImpl {
	private Map<String, ArrayList> hashMap = new HashMap<>();
	private ArrayList<ExchangeRate> list;
	
	public ExchangeRateImpl() {
		ExchangeRate totalEngland1= new ExchangeRate( "SGD", 1.75238);
		ExchangeRate totalEngland2 = new ExchangeRate( "USD", 1.27786);
		ExchangeRate totalEngland3 = new ExchangeRate( "EUR",1.12218);
		
		list = new ArrayList<>();
		list.add(totalEngland1);
		list.add(totalEngland2);
		list.add(totalEngland3);
		hashMap.put("GBP", list);
		
		ExchangeRate totalJapan1= new ExchangeRate( "INR", 0.615533);
		ExchangeRate totalJapan2 = new ExchangeRate( "GBP", 0.00689787);
		ExchangeRate totalJapan3 = new ExchangeRate( "SGD", 0.0120844);
		
		list = new ArrayList<>();
		list.add(totalJapan1);
		list.add(totalJapan2);
		list.add(totalJapan3);
		hashMap.put("JPY", list);
		
		ExchangeRate totalSingapore1= new ExchangeRate( "GBP", 0.570879);
		ExchangeRate totalSingapore2 = new ExchangeRate( "MYR", 3.05657);
		ExchangeRate totalSingapore3 = new ExchangeRate( "INR", 50.9410);
		
		list = new ArrayList<>();
		list.add(totalSingapore1);
		list.add(totalSingapore2);
		list.add(totalSingapore3);
		hashMap.put("SGD", list);
		
		
	}
	
	public ArrayList getResult (String denomination) {
		return hashMap.get(denomination);
	}


}
