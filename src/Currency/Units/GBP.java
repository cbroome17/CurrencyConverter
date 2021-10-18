/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Currency.Units;

/**
 *
 * @author Tripl
 */
public class GBP extends Currency{
    
    public GBP(double amt) {
        super();
        conversion.put("USD", 1.37);
        conversion.put("EURO", 1.19);
        conversion.put("KRW", 1625.74);
        conversion.put("JPY", 157.22);
        conversion.put("AUD", 1.85);
        conversion.put("CAD", 1.70);
        conversion.put("CNY", 8.85);
        conversion.put("MXN", 27.96);
        conversion.put("GBP", 1.00);
        startingAmt = amt;
        currencyUnit = "GBP";
    }

}
