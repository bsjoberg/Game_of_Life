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
		Cell cell = new Cell();
		cell.setAlive(true);
		cell.setNumberOfAliveNeighbors(0);
		cell.tick();
		
		Assert.assertFalse(cell.isAlive());
	}
	
	@Test
	public void testCellDiesByOverpopulationFourAliveNeighbors() {
		Cell cell = new Cell();
		cell.setAlive(true);
		cell.setNumberOfAliveNeighbors(4);
		cell.tick();
		
		Assert.assertFalse(cell.isAlive());
	}
	
	@Test
	public void testCellDiesByOverpopulationFiveAliveNeighbors() {
		Cell cell = new Cell();
		cell.setAlive(true);
		cell.setNumberOfAliveNeighbors(5);
		cell.tick();
		
		Assert.assertFalse(cell.isAlive());
	}
	
	@Test
	public void testCellComesAliveWithExactlyThreeLiveNeighbors() {
		Cell cell = new Cell();
		cell.setAlive(false);
		cell.setNumberOfAliveNeighbors(3);
		cell.tick();
		
		Assert.assertTrue(cell.isAlive());
	}
	
	@Test
	public void testCellStaysDeadWithTwoLiveNeighbors() {
		Cell cell = new Cell();
		cell.setAlive(false);
		cell.setNumberOfAliveNeighbors(2);
		cell.tick();
		
		Assert.assertFalse(cell.isAlive());
	}
}
