package fun;

public class Cell {
	static public final int ALIVE = 1;
	static public final int DEAD = 2;
	
	private int status;
	
	public void setStatus(int status) {
		this.status = status;
	}

	public Object getStatus() {
		return status;
	}
}
