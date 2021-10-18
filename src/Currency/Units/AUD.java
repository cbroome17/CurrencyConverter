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
public class AUD extends Currency {
    
    public AUD(double amt) {
        super();
        conversion.put("USD", 0.74);
        conversion.put("EURO", 0.64);
        conversion.put("GBP", 0.54);
        conversion.put("JPY", 84.71);
        conversion.put("KRW", 877.17);
        conversion.put("CAD", 0.92);
        conversion.put("CNY", 4.77);
        conversion.put("MXN", 15.09);
        conversion.put("AUD", 1.00);
        startingAmt = amt;
        currencyUnit = "AUD";
    }
    
}
