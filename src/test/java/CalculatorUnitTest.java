import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class CalculatorUnitTest {



    @Test
    public void addUnitTest(){
        int result = Calculator.add(2,2);
        assertEquals(4,result);
    }
    @Test
    public void minUnitTest(){
        int result = Calculator.min(2,2);
        assertEquals("2-2=0",0,result);
    }
    @Test
    public void multiPlyTest(){
        int result = Calculator.multiply(2,2);
        assertEquals("2*2=4",4,result);

    }
    @Test
    public void remainderTest(){
        int result = Calculator.remainder(3,2);
        assertEquals("3%2=1",1,result);

    }
    @Test
    public void divideTest(){
        int result = Calculator.divide(3,2);
        assertEquals("3/2=1",1,result);
    }
}
