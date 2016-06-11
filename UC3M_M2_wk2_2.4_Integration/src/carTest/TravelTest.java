package carTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import car.Car;
import car.FuelTank;
import car.GasStation;

public class TravelTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNotEnoughFuelForTravel ()  {
	     FuelTank tank = new FuelTank(40, 15);
	     Car car = new Car(tank, 0.09);
	     double km = 250.0;
	     
	     GasStation instGasStation = new GasStation(0.8,1.0);
	     double missingKms= car.travel(km);
	          
	     double payment = instGasStation.refuel(car, missingKms);
	     
	     System.out.println("Fuel to be refueled: " + missingKms*0.09 + " and the cost is " + payment + " USD");
	     System.out.println(" Kilometers to travel: expected not 0, obtained: " + car.travel(km));
	  }	
}
