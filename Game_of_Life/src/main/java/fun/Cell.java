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
		if (numberOfAliveNeighbors == 1)
			alive = false;
	}

	public boolean isAlive() {
		return alive;
	}
	
}
