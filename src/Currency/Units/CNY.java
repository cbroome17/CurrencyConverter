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
public class CNY extends Currency {
    public CNY(double amt) {
        super();
        conversion.put("USD", 0.16);
        conversion.put("EURO", 0.13);
        conversion.put("GBP", 0.11);
        conversion.put("JPY", 17.77);
        conversion.put("KRW", 183.78);
        conversion.put("AUD", 0.21);
        conversion.put("CAD", 0.19);
        conversion.put("MXN", 3.16);
        conversion.put("CNY", 1.00);
        startingAmt = amt;
        currencyUnit = "CNY";
    }
}
