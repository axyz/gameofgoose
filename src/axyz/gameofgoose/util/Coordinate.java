package axyz.gameofgoose.util;

/**
 * Class that represent a coordinate.
 * 
 * @author Andrea Moretti
 */
public class Coordinate {
	private int x;
	private int y;

	/**
	 * Constructor of the class.
	 * 
	 * @param x
	 * @param y
	 */
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

}
