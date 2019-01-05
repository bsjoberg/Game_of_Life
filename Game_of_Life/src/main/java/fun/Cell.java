package fun;

public class Cell {
	private boolean alive = false;
	private int numberOfAliveNeighbors = 0;
	
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setNumberOfAliveNeighbors(int i) {
		numberOfAliveNeighbors = i;
	}

	public void tick() {
		// Create logic that determines whether the cell lives or dies
		
		// Handle Underpopulation
		if (this.alive == true) {

			if (numberOfAliveNeighbors == 1 || numberOfAliveNeighbors == 0)
				alive = false;
			else if (numberOfAliveNeighbors >= 4)
				alive = false;
		}
		else if (this.alive == false) {
			if (numberOfAliveNeighbors == 3)
				alive = true;
		}
	}

	public boolean isAlive() {
		return alive;
	}
	
}
