package fun;

import java.util.ArrayList;
import java.util.List;

public class Grid {
	List<List<Cell>> grid;
	int xSize = 0;
	int ySize = 0;
	
	public Grid (int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
	}

	public Grid(String gridString) throws IllegalArgumentException {
		// Parse string
		String delims = ",";
		String[] rowTokens = gridString.split(delims);
		boolean areRowsSameLength = false;
		
		// Determine number of tokens to determine ySize
		ySize = rowTokens.length;
		
		// Determine length of each token to determine xSize
		xSize = rowTokens[0].length();
		
		for (int i = 0; i < ySize; i++) {
			
			if (xSize != rowTokens[i].length()) {
				areRowsSameLength = false;
				break;
			}
			else
				areRowsSameLength = true;
		}
		
		if (!areRowsSameLength) {
			throw new IllegalArgumentException("String array is not an unequal row length.");
		}
		else {
			populateGrid(rowTokens);
		}
	}

	private void populateGrid(String[] rowTokens) throws IllegalArgumentException {
		grid = new ArrayList<List<Cell>>();
		
		// Loop throw and populate grid
		for (int y = 0; y < ySize; y++) {
			grid.add(new ArrayList<Cell>());
			String row = rowTokens[y];
			
			for (int x = 0; x < xSize; x++) {
				char cellState = row.charAt(x);
				Cell cell = new Cell();
				if (cellState == 'A') {
					cell.setAlive(true);
				} else if (cellState == 'D') {
					cell.setAlive(false);
				} else {
					throw new IllegalArgumentException("Wasn't an A or D");
				}
				
				// Add cell to grid
				grid.get(y).add(x, cell);
			}
		}
	}

	public int getXSize() {
		return xSize;
	}
	
	public int getYSize() {
		return ySize;
	}
	
	public int numberSurroundingAliveAt(int x, int y) {
		int aliveCount = 0;
		
		// Loop throw all cells that are one off from the passed in position
		for (int yPos = y - 1; yPos <= (y + 1); yPos++) {
			for (int xPos = x - 1; xPos <= (x + 1); xPos++) {
				// Don't go out of bounds
				if (xPos >= 0 && yPos >= 0) {
					// Don't check the cell position
					if (xPos != x || yPos != y) {
						if (grid.get(xPos).get(yPos).isAlive())
							aliveCount++;
					}
				}
			}
		}
		
		return aliveCount;
	}

	public Cell cellAt(int x, int y) {
		return grid.get(y).get(x);
	}

	public void tick() {
		// New state of grid
		List<List<Cell>> newGrid = new ArrayList<List<Cell>>();
	}
	
}
