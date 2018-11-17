package fun;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

public class CellUnit {

	@Test
	public void GetNextState_GivenLiveWithLessThanTwoLiveNeighbors_ExpectDead()
	{
		INeighborGetter mockedNeighborGetter = Mockito.mock(INeighborGetter.class);

		List<Cell> oneLiveNeighbor = new ArrayList<Cell>();
		oneLiveNeighbor.add(new Cell(true, mockedNeighborGetter));
		
		Mockito.when(mockedNeighborGetter.GetNeighbors()).thenReturn(oneLiveNeighbor);
		
		Cell cell = new Cell(true, mockedNeighborGetter);
		
		boolean result = cell.GetNextState();
		
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void GetNextState_GivenLiveWithTwoLiveNeighbors_ExpectLive()
	{
		INeighborGetter mockedNeighborGetter = Mockito.mock(INeighborGetter.class);

		List<Cell> twoLiveNeighbor = new ArrayList<Cell>();
		twoLiveNeighbor.add(new Cell(true, mockedNeighborGetter));
		twoLiveNeighbor.add(new Cell(true, mockedNeighborGetter));
		
		Mockito.when(mockedNeighborGetter.GetNeighbors()).thenReturn(twoLiveNeighbor);
		
		Cell cell = new Cell(true, mockedNeighborGetter);
		
		boolean result = cell.GetNextState();
		
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void GetNextState_GivenLiveWithThreeLiveNeighbors_ExpectLive()
	{
		INeighborGetter mockedNeighborGetter = Mockito.mock(INeighborGetter.class);

		List<Cell> threeLiveNeighbor = new ArrayList<Cell>();
		threeLiveNeighbor.add(new Cell(true, mockedNeighborGetter));
		threeLiveNeighbor.add(new Cell(true, mockedNeighborGetter));
		threeLiveNeighbor.add(new Cell(true, mockedNeighborGetter));
		
		Mockito.when(mockedNeighborGetter.GetNeighbors()).thenReturn(threeLiveNeighbor);
		
		Cell cell = new Cell(true, mockedNeighborGetter);
		
		boolean result = cell.GetNextState();
		
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void GetNextState_GivenWhenDeadWithThreeLiveNeighbor_ExpectedAlive()
	{
		INeighborGetter mockedNeighborGetter = Mockito.mock(INeighborGetter.class);

		List<Cell> threeLiveNeighbors = new ArrayList<Cell>();
		threeLiveNeighbors.add(new Cell(true, mockedNeighborGetter));
		threeLiveNeighbors.add(new Cell(true, mockedNeighborGetter));
		threeLiveNeighbors.add(new Cell(true, mockedNeighborGetter));
		
		Mockito.when(mockedNeighborGetter.GetNeighbors()).thenReturn(threeLiveNeighbors);
		
		Cell cell = new Cell(false, mockedNeighborGetter);
		
		boolean result = cell.GetNextState();
		
		Assert.assertEquals(true, result);
	}
}
