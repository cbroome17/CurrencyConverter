package Currency.Units;


public class USD extends Currency {
	//private HashMap<String, Double> USDConv;
	//Creates a HashMap that is able to store conversion key/value pairs.
	
    public USD(double amt) {
        super();
        conversion.put("GBP", 0.73);
        conversion.put("EURO", 0.86);
        conversion.put("KRW", 1186.87);
        conversion.put("JPY", 113.23);
        conversion.put("AUD", 1.36);
        conversion.put("CAD", 1.24);
        conversion.put("CNY", 6.44);
        conversion.put("MXN", 20.34);
        conversion.put("USD", 1.00);
        startingAmt = amt;
        currencyUnit = "USD";
    }
	
}
