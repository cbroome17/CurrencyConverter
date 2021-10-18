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
public class MXN extends Currency {
    public MXN(double amt) {
        conversion.put("USD", 0.049);
        conversion.put("EURO", 0.042);
        conversion.put("GBP", 0.036);
        conversion.put("JPY", 5.62);
        conversion.put("KRW", 58.15);
        conversion.put("AUD", 0.066);
        conversion.put("CAD", 0.061);
        conversion.put("CNY",0.32);
        conversion.put("MXN", 1.00);
        startingAmt = amt;
        currencyUnit = "MXN";
    }
}
