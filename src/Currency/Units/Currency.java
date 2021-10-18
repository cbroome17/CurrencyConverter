package Currency.Units;

import java.text.DecimalFormat;
import java.util.HashMap;

abstract public class Currency {

    protected HashMap<String, Double> conversion;
    protected double startingAmt;
    protected double endingAmt;
    protected String currencyUnit;

    public Currency() {
        conversion = new HashMap<String, Double>();
    }

    public double convert(String x) {

        endingAmt = (startingAmt * conversion.get(x));
        return endingAmt;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        return df.format(startingAmt) + " " + currencyUnit + " would be converted to approximately " + df.format(endingAmt);
    }

    //abstract public double getRate(String x);
}
