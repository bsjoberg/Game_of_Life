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
	public void testFindSurroudingCellsNumberAlive() {
		// Create grid with alive and dead cells
		Grid grid = new Grid("DDD,DAD,DDD");
		

		// Select a cell and find out each surrounding cells status
		int numberAlive = grid.numberSurroundingAliveAt(0,0);
		
		Assert.assertEquals(1, numberAlive);		
	}
}
