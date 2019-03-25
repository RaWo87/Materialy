package SDA;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNull;

@RunWith(JUnitParamsRunner.class)// implementacja runnera dla klasy
public class TestCalc {

private Calc calc;

@Before
    public void setUP() throws Exception{
    this.calc = new Calc();
}
@Test
@Parameters(method = "getNumbers")
    public void testDodaj(int a, int b){
    int resault = calc.dodaj(a,b);
    Assert.assertEquals(a+b,resault);
}
public Object[] getNumbers()throws IOException {
    File csvFile = new File("./resources/dane.csv");
    LineIterator iterator = FileUtils.lineIterator(csvFile,"UTF-8");
    List<String> out = new ArrayList<>();
    while(iterator.hasNext()){
        out.add(iterator.next());
    }
    Object[] resault = new Object[out.size()];
    for (int i = 0; i < resault.length; i++) {
        resault[i] = out.get(i);
    }

return resault;
}
@Test
    public void testMnoz(){
    double resault = calc.mnoz(2,5);
    Assert.assertEquals(10,resault,0);
}
@Test
@Parameters({"4,2","2,0","1,10"})
    public void testDziel(int a, int b) {
    try {
        Assert.assertEquals(a/b, calc.dziel(a, b), 5);
    }catch (ArithmeticException e){
        Assert.assertEquals(e.getMessage(),"/ by zero");
    }
}
@Rule public ExpectedException thrown = ExpectedException.none();
@Test
@Parameters({"2,0","2,3"})
public void testDzielExceptions(int a, int b){
    thrown.expect(ArithmeticException.class);
    thrown.expectMessage("/ by zero");
    Assert.assertEquals(a/b, calc.dziel(a, b), 5);

}

@Test
public void testPower(){
Double resault = calc.power(2,2);
Assert.assertEquals(Double.valueOf(4),resault);
}

@Test
@Parameters({"1,1","2,2","6,3","24,4","5,-5"})
    public void testFactorial(int expected, int given) {
    try {
        Assert.assertEquals(expected, calc.factorial(given));
    }catch (ArithmeticException e){
        Assert.assertEquals("must be positive",e.getMessage());
    }
}
@Test
    @Parameters(method = "primeProvider")
public void testPrimes(int given, int[] expected){
    Assert.assertArrayEquals(calc.primes(given),expected);
}

public Object[] primeProvider(){
    return new Object[]{
            new Object[]{0,new int[]{0}},
            new Object[]{5,new int[]{2,3,5}},
            new Object[]{1,new int[]{0}}
    };
}
    @Test
    @Parameters(method = "sortProvider")
    public void testBubbleSort(int[] given, int[] expected){
    Assert.assertArrayEquals(calc.bubbleSort(given),expected);

}
    public Object[] sortProvider(){
    return new Object[]{
            new Object[]{new int[]{1,2,3,4,5},new int[]{1,2,3,4,5}},
            new Object[]{new int[]{5,4,3,2,1},new int[]{1,2,3,4,5}},
            new Object[]{new int[]{-1,3,1,2,0},new int[]{-1,0,1,2,3}},
            new Object[]{new int[]{-5,2,10,4,5},new int[]{-5,2,4,5,10}}
    };
}

}
