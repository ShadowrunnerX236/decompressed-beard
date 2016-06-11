package fuelTank;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fuelTank.FuelTank;

@RunWith(Parameterized.class)
public class ParameterizedFillTankTest {

    FuelTank tank = null;
    
    private int param;
    private int result;
    
   @Parameters
   public static Collection<Object[]> litreNumbers() {
     Object[][] liters = new Object[][] {{10,20},{15,25},{20,30},{35,45}};
     return Arrays.asList(liters);
   }

   public ParameterizedFillTankTest(int param, int result) {
     this.param = param;
     this.result = result;
   }
   
   @Before
    public void setUp() throws Exception {
        tank = new FuelTank(60,10);
    }
   
   @Test
   public void testFill() {
     tank.fill(this.param);
     assertEquals(this.result, tank.getTankLevel(), 0);
   }
}
