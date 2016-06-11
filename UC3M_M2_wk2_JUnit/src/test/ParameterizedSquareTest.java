package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import example.Calculator;

@RunWith(Parameterized.class)
public class ParameterizedSquareTest {

    Calculator calc = null;
    
    private int param;
    private int result;
    
   @Parameters
   public static Collection<Object[]> squareNumbers() {
     Object[][] numbers = new Object[][] {{2,4}, {3,9}, {4,16}};
     return Arrays.asList(numbers);
   }

   public ParameterizedSquareTest(int i, int r) {
     this.param = i;
     this.result = r;
   }
   
   @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }
   
   @Test
   public void testSquare() {
	 calc.square(this.param);
     assertEquals(this.result, calc.getResult(), 0);
   }

}