package SDA.Strategy;

import java.math.BigDecimal;

public interface TaxStrategy {
    BigDecimal calculateTax(BigDecimal moneyToTax);
}
