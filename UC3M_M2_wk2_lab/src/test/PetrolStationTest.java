package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import travel.Car;
import travel.FuelTank;
import travel.PetrolStation;

@RunWith(Parameterized.class)
public class PetrolStationTest {

	PetrolStation testStation=null;
	Car testCar=null;
	FuelTank testTank=null;
	
	private double param;
	private double result;
	 
	/*
	 for(int i = 0; i < (int) maxAmountFuel; i++){

		if (canAddMoreFuel(tank)){
			tank.fill(fuelQuantum);
			amountFiled = amountFiled + fuelQuantum;
		} else {
			break;
		}
	};
	 */
	
	@Parameters
	   public static Collection<Object[]> squareNumbers() {
	     Object[][] numbers = new Object[][] {{4,2},{10,8}};
	     return Arrays.asList(numbers);
	   }

	   public PetrolStationTest(double i, double r) {
	     this.param = i;
	     this.result = r;
	   }
	   
	 @Before
	 public void setUp() throws Exception {
	     testStation = new PetrolStation(0,2,1);
	     testTank = new FuelTank(40,38);
	     testCar = new Car(testTank,0.6);
	 }
	   
	@Test
	public void testFillEuros() {
		assertEquals(result,testStation.fillEuros(testCar,param),0.001);
		testTank = new FuelTank(40,39.5);
	    testCar = new Car(testTank,0.6);
	    assertEquals(param,testStation.fillEuros(testCar,param),0.001);
	}

}
