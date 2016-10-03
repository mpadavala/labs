package com.labs.currency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.padavala.labs.currency.gen.Currencies;
import com.padavala.labs.currency.gen.Resources;

public class ForeignExchangeService {
	
	private static final String hostUrl = "http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote?format=json";
	private Gson gson = new Gson();
	private Map<String, String> map = new HashMap<String, String>();
	
	private static final String USD2INR = "INR=X";
	private static final String SILVER = "XAG=X";
	private static final String GOLD = "XAU=X";
	
	public static void main(String args[]){
		ForeignExchangeService currencyService = new ForeignExchangeService();
		
		System.out.println(currencyService.get(USD2INR));
		System.out.println(currencyService.getGoldPrice());
		System.out.println(currencyService.getSilverPrice());
	}
	
	
	public ForeignExchangeService(){
		URL url;
		try {
			url = new URL(hostUrl);
			URLConnection connection = url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			Currencies currencies = gson.fromJson(bufferedReader, Currencies.class);
			List<Resources> resourcesList = currencies.getList().getResources();
			for(Resources resources : resourcesList){
				map.put(resources.getResource().getFields().getSymbol(), resources.getResource().getFields().getPrice());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public float get(String symbol){
		return Float.parseFloat(map.get(symbol));
	}
	public float getUSD2INR(){
		return Float.parseFloat(map.get(USD2INR));
	}
	public float getGoldPrice(){		
		return reverse(GOLD);
	}
	public float getSilverPrice(){
		return reverse(SILVER);
	}
	
	private float reverse(String symbol){
		return  1/Float.parseFloat(map.get(symbol));
	}
}
