package fuelTank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FuelTankTest {

	private FuelTank tank = null;
	
	@Before
	public void setUp() throws Exception {
		tank = new FuelTank(40,10);
	}

	@Test
	public void testGetTankLevel() {
		assertEquals(10,tank.getTankLevel(),0);
	}

	@Test
	public void testGetTankMax() {
		assertEquals(40,tank.getTankMax(),0);
	}

	@Test
	public void testIsEmpty() {
		assertFalse(tank.isEmpty());
	}

	@Test
	public void testIsFull() {
		assertFalse(tank.isFull());
	}

}
