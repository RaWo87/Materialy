package SDA;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCalc {
    Calculator calc;
    @Before
    public void setUP(){
        this.calc= new Calculator();
    }

    @Test
    public void addTest(){
        Assert.assertEquals(calc.add(2,2), 4);
    }
    @Test
    public void isEvenTest(){
        boolean resault = calc.isEven(2);
        Assert.assertEquals(resault,true);
    }
    @Test
    public void squareTest(){
        int resault = calc.square(2);
        Assert.assertEquals(resault,4);
    }
    @Test
    public void powerOfTest(){
        int resault = calc.powerOf(3,3);
        Assert.assertEquals(resault,27);
    }
    @Test
    public void getVatTest(){
        double resault = calc.getVat(100);
        Assert.assertEquals(resault,19);
    }


}
