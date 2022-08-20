import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorCheck {



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
        public void remainderTest2(){
            int result = Calculator.remainder(3,3);
            assertEquals("3%3=0",0,result);

        }

        @Test
        public void divideTest(){
            int result = Calculator.divide(3,1);
            assertEquals("3/2=1",1,result);
        }
    }


