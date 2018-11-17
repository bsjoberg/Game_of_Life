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
	public void testCellAlive() {
		Cell cell = new Cell();
		cell.setStatus(Cell.ALIVE);
		
		Assert.assertEquals(Cell.ALIVE, cell.getStatus());
	}

	@Test
	public void testCellDead() {
		Cell cell = new Cell();
		cell.setStatus(Cell.DEAD);
		
		Assert.assertEquals(Cell.DEAD, cell.getStatus());
	}
}
