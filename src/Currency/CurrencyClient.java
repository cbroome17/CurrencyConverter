package Currency;

import Currency.Units.*;

public class CurrencyClient {
	//---INFO---
	/*
	 * Starting Amount (Original Currency) / Ending Amount (New Currency) = Exchange Rate
	 * 
	 * --$ USD--
	 * $1 USD --> $0.86 EURO --- USD/EURO $80 * 0.86 
	 * $1 USD --> 1186.87 KRW --- USD/KRW
	 * $1 USD --> 113.23 JPY --- USD/JPY
	 * 
	 * 
	 * 
	 * --€ EURO--
	 * €1 EURO --> €1.16 USD ---  EURO/USD
	 * 
	 * 
	 * --₩ KRW --
	 * 
	 * 
	 * --¥ JPY --
	 * 
	 */
	
	//Converting USD to Euro
	//(Starting USD) / (Exchange Rate) = (Ending Euro)
	
	public static void main(String[] args) {
		//First task - Converting 80 USD to Euros
		//Create method to get user input for conversions
		
		USD usd1 = new USD(80);
		System.out.println(usd1.convert("EURO"));
		System.out.println(usd1.convert("JPY"));
		System.out.println(usd1.convert("AUD"));
		System.out.println(usd1.convert("KRW"));
		System.out.println(usd1.convert("CAD"));
		
		//Testing newUSD method
		USD usdMethod = newUnit();
		System.out.println(usdMethod.convert("EURO"));
		
		//CurrencyList
		Currency[] currList = {
				new USD(80),
				new EURO(80),
				new JPY(80),
				
		};
		
		int[] currListMatch = new int[currList.length];
		for (int i = 0; i < currListMatch.length; i++) {
			currListMatch[i] = i;
		}
		
		String[] indexTesting = {
				"String 0",
				"String 1",
		};
		
		for (int i = 0; i < indexTesting.length; i++) {
			
		}
		
		currList[0].convert("EURO");
		currList[1].convert("USD");
		//currList[2].convert("USD");
		System.out.println(currList[0] + " EURO");
		System.out.println(currList[1] + " USD");
		//System.out.println(currList[2] + " USD");
		
	} //end main
	
	public static USD newUnit() {
		USD usdMethod = new USD(80);
		return usdMethod;
	}
	
	public static int linearSearch(String x, String[] indexTesting) {
		
		for (int i = 0; i < indexTesting.length; i++) {
			if (indexTesting[i] == x) {
				return i; //Returns the index of the search query.
			}
		}
		
		return 0;
	}
	
	
	
}
