package Currency.Units;

public class JPY extends Currency {
	
    public JPY(double amt) {
        super();
        conversion.put("USD", 0.0088);
        conversion.put("EURO", 0.0075);
        conversion.put("GBP", 0.0064);
        conversion.put("KRW", 10.36);
        conversion.put("AUD", 0.0012);
        conversion.put("CAD", 0.011);
        conversion.put("CNY", 0.056);
        conversion.put("MXN", 0.18);
        conversion.put("JPY", 1.00);
        startingAmt = amt;
        currencyUnit = "JPY";
    }

}
