package fun;

public class Grid {
	int xSize = 0;
	int ySize = 0;
	
	public Grid (int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
	}

	public Grid(String gridString) {
		// Parse string
		String delims = ",";
		String[] rowTokens = gridString.split(delims);
		
		// Determine length of each token to determine xSize
		xSize = rowTokens[0].length();
		
		// Determine number of tokens to determine ySize
		ySize = rowTokens.length;
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
	
}
