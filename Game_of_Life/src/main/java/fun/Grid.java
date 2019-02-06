package fun;

public class Grid {
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

	private void populateGrid(String[] rowTokens) {
		// TODO Auto-generated method stub
		
	}

	public int getXSize() {
		return xSize;
	}
	
	public int getYSize() {
		return ySize;
	}
	
	public int numberSurroundingAliveAt(int i, int j) {
		return 1;
	}

	public Cell cellAt(int i, int j) {
		return new Cell();
	}
	
}
