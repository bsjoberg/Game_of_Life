package fun;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GridUnit {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGridStringConstructor() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("DDD,DAD,DDD");

		Assert.assertEquals(3, grid.xSize);
		Assert.assertEquals(3, grid.ySize);
	}

	@Test
	public void testGridStringConstructorWithInconsistentLengths() {
		try {
			Grid grid = new Grid("DDD, DDDD, DDD");
		} catch (IllegalArgumentException iae) {
			Assert.assertNotNull(iae);
		}
	}
	
	@Test
	public void testFindSurroundingCellsNumberAliveAt0_0() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("DDD,DAD,DDD");

		// Select a cell and find out each surrounding cells status
		int numberAlive = grid.numberSurroundingAliveAt(0, 0);

		Assert.assertEquals(1, numberAlive);
	}

	@Test
	public void testFindSurroundingCellsNumberAliveAt1_1() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("DDD,DAD,DDD");

		// Select a cell and find out each surrounding cells status
		int numberAlive = grid.numberSurroundingAliveAt(1, 1);

		Assert.assertEquals(0, numberAlive);
	}
}
