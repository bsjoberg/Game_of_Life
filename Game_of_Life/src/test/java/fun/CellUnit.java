package fun;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CellUnit {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCellDiesByUnderpopulationOneAliveNeighbor() {
		Cell cell = new Cell();
		cell.setAlive(true);
		cell.setNumberOfAliveNeighbors(1);
		cell.tick();
		
		Assert.assertFalse(cell.isAlive());
	}

	@Test
	public void testCellDiesByUnderpopulationZeroAliveNeighbors() {
		
	}
	
}
