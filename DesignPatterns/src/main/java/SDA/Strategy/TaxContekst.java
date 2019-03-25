package SDA.Strategy;

import java.math.BigDecimal;

public class TaxContekst {
    private TaxStrategy strategy;

    public void setTaxingStrategy(TaxStrategy strategy){
        this.strategy = strategy;
    }

    public BigDecimal calculateTaxAccordingToStrategy(BigDecimal moneyToTax){

        return  strategy.calculateTax(moneyToTax);
    }

}
