package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import travel.Car;
import travel.FuelTank;
import travel.PetrolStation;

public class CarTest {

	PetrolStation testStation=null;
	Car testCar=null;
	FuelTank testTank=null;
	
	private double consump = 0.5;
	private double capMaxTest = 40;
		
	@Before
	 public void setUp() throws Exception {
	     testStation = new PetrolStation(0,2,1);
	     testTank = new FuelTank(capMaxTest,capMaxTest/2);
	     testCar = new Car(testTank,consump);
	 }
	
	@Test
	public void amountFuelTest(){
		double km = 30;
		assertEquals(km * consump,testCar.amountFuel(km),0);
	}
	
	@Test
	public void amountKilometersTest(){
		double fuel = 10;
		assertEquals(fuel / consump,testCar.amountKilometers(fuel),0);
	}
	
	@Test
	public void getTankTest(){
		assertTrue(testCar.getTank()!=null);
	}
	
	@Test
	public void testNotEnoughFuelForTravel ()  {
	     FuelTank tank = new FuelTank(40, 15);
	     Car car = new Car(tank, 0.5);
	     double km = 250.0;
	     
	     PetrolStation instGasStation = new PetrolStation(1,2,1.0);
	     double missingKms= car.travel(km);
	          
	     double payment = instGasStation.fillEuros(car, missingKms);
	     
	     System.out.println("Fuel to be refueled: " + missingKms*0.09 + " and the cost is " + payment + " USD");
	     System.out.println(" Kilometers to travel: expected not 0, obtained: " + car.travel(km));
	  }	

}
