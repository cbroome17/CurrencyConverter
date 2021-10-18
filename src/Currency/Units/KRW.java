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
public class KRW extends Currency {

    public KRW(double amt) {
        super();
        conversion.put("USD", 0.00085);
        conversion.put("EURO", 0.00073);
        conversion.put("GBP", 0.00062);
        conversion.put("JPY", 0.097);
        conversion.put("AUD", 0.0011);
        conversion.put("CAD", 0.0010);
        conversion.put("CNY", 0.0054);
        conversion.put("MXN", 0.017);
        conversion.put("KRW", 1.00);
        startingAmt = amt;
        currencyUnit = "KRW";
    }

}
