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
			new Grid("DDD, DDDD, DDD");
		} catch (IllegalArgumentException iae) {
			Assert.assertNotNull(iae);
		}
	}

	@Test
	public void testGetCellStatusAt0_0() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("DDD,DAD,DDD");
		
		Assert.assertFalse(grid.cellAt(0,0).isAlive());
	}

	@Test
	public void testGetCellStatusAt1_1() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("DDD,DAD,DDD");
		
		Assert.assertTrue(grid.cellAt(1,1).isAlive());
	}
	
	@Test
	public void testGetCellStatusAt1_2() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("DDD,DAD,DAD");
		
		Assert.assertTrue(grid.cellAt(1,2).isAlive());
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
	
	@Test
	public void testFindSurroundingCellsNumberAliveAtOuterEdge() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("DDD,DAD,DDD");

		// Select a cell and find out each surrounding cells status
		int numberAlive = grid.numberSurroundingAliveAt(2,1);

		Assert.assertEquals(1, numberAlive);
	}
	
	@Test
	public void testFindSurroundingCellsNumberAliveAt0_1() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("AAA,DAD,DDD");

		// Select a cell and find out each surrounding cells status
		int numberAlive = grid.numberSurroundingAliveAt(0, 1);

		Assert.assertEquals(3, numberAlive);
	}
	
	@Test
	public void testCreateGridWithDifferentXAndYSize () {
		Grid grid = new Grid("DDDD,AAAA,AAAD,AAAA,AAAD");
		
		Assert.assertFalse(grid.cellAt(3, 4).isAlive());
		Assert.assertTrue(grid.cellAt(3, 3).isAlive());
		Assert.assertFalse(grid.cellAt(3, 0).isAlive());
	}
	
	@Test
	public void testCellAt0_0ComesAliveAfterTick() {
		// Create grid where two neighbors are alive and cell is alive
		Grid grid = new Grid("DAD,AAD,DDD");
		
		// Tick the grid
		grid.tick();
		
		Assert.assertTrue(grid.cellAt(0, 0).isAlive());
	}
}
