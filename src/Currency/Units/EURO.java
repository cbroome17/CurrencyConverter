package Currency.Units;

public class EURO extends Currency {
	//private HashMap<String, Double> EUROConv;
	
    public EURO(double amt) {
        super();
        conversion.put("GBP", 0.84);
        conversion.put("USD", 1.16);
        conversion.put("KRW", 1372.00);
        conversion.put("JPY", 131.66);
        conversion.put("AUD", 1.56);
        conversion.put("CAD", 1.44);
        conversion.put("CNY", 7.47);
        conversion.put("MXN", 23.59);
        conversion.put("EURO", 1.00);
        startingAmt = amt;
        currencyUnit = "EURO";

    }
	
}
