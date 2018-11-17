package fun;

import java.util.List;

public class Cell {
	
	private INeighborGetter _neighborGetter;
	private boolean _isAlive;
	public Cell(boolean isAlive, INeighborGetter neighborGetter) {
		this._neighborGetter = neighborGetter;
		this._isAlive = isAlive;
	}
	
	public boolean IsAlive()
	{
		return this._isAlive;
	}
	
	public boolean GetNextState() {
		List<Cell> neighbors = this._neighborGetter.GetNeighbors();
		
		int aliveNeighborCount = 0;
		
		for(Cell thing : neighbors)
		{
			if (thing.IsAlive())
			{
				aliveNeighborCount++;
			}
		}
		
		if(this.IsAlive() && aliveNeighborCount < 2) {
			return false;
		}
		// Handle when dead cell and 3 live neighbors
		else if (!this.IsAlive() && aliveNeighborCount == 3){
			return true;
		}
		else if (this.IsAlive() && aliveNeighborCount == 2) {
			return true;
		}
		else if (this.IsAlive() && aliveNeighborCount == 3) {
			return true;
		}
		else
			return false;
		
	}

}
