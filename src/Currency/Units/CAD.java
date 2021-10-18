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
public class CAD extends Currency {

    public CAD(double amt) {
        super();
        conversion.put("USD", 0.81);
        conversion.put("EURO", 0.70);
        conversion.put("KRW", 956.36);
        conversion.put("JPY", 92.48);
        conversion.put("AUD", 1.09);
        conversion.put("GBP", 0.59);
        conversion.put("CNY", 5.20);
        conversion.put("MXN", 16.45);
        conversion.put("CAD", 1.00);
        startingAmt = amt;
        currencyUnit = "CAD";
    }
}
