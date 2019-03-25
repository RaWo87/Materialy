package SDA.Factory;

import org.junit.Assert;
import org.junit.Test;

public class testFactoryCar {

    @Test
    public void testFactoryCar(){
        Car benzinCar = FactoryCar.createCar(FactoryCar.FuelType.BENZIN);
        Assert.assertEquals(benzinCar.getFuel(),"Benzin");
    }
}
