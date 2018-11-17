package fun;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniverseUnit {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeadCellBecomesAliveWith3LiveNeighbors() {
		Universe universe = new Universe();
		
//		// Add cells to the universe
//		universe.addCell(new Cell(false), 0, 0);
//		universe.addCell(new Cell(true), 1, 0);
//		universe.addCell(new Cell(true), 0, 1);
//		universe.addCell(new Cell(true), 1, 1);
//		
//		universe.tick();
//		
//		Assert.assertTrue(universe.getCellAt(0, 0).isAlive());
	}

}
