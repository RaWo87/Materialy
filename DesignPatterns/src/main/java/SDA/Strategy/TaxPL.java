package SDA.Strategy;

import java.math.BigDecimal;

public class TaxPL implements TaxStrategy {
    @Override
    public BigDecimal calculateTax(BigDecimal moneyToTax) {
        return moneyToTax.multiply(BigDecimal.valueOf(0.23));
    }
}
