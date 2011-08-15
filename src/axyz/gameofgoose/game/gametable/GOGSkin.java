package axyz.gameofgoose.game.gametable;

import axyz.gameofgoose.util.Coordinate;

/**
 * Class that represent a Skin for the game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGSkin extends Skin {

	private final int coordinateMap[][];
	private Coordinate _tmp;
	private final String dice1, dice2, dice3, dice4, dice5, dice6, redGoose,
			blueGoose, greenGoose, yellowGoose;

	/**
	 * Constructor of the class.
	 * 
	 * @param s
	 *            the path of the background image
	 * @param d1
	 *            the path of the image of the face 1 of the dices
	 * @param d2
	 *            the path of the image of the face 2 of the dices
	 * @param d3
	 *            the path of the image of the face 3 of the dices
	 * @param d4
	 *            the path of the image of the face 4 of the dices
	 * @param d5
	 *            the path of the image of the face 5 of the dices
	 * @param d6
	 *            the path of the image of the face 6 of the dices
	 * @param r
	 *            the path of the image of the avatar of the red goose
	 * @param b
	 *            the path of the image of the avatar of the blue goose
	 * @param g
	 *            the path of the image of the avatar of the green goose
	 * @param y
	 *            the path of the image of the avatar of the yellow goose
	 * @param cmap
	 *            the coordinate map that associate a coordinate for each of the
	 *            63 boxes
	 */
	public GOGSkin(String s, String d1, String d2, String d3, String d4,
			String d5, String d6, String r, String b, String g, String y,
			int[][] cmap) {
		super(s);
		this.dice1 = d1;
		this.dice2 = d2;
		this.dice3 = d3;
		this.dice4 = d4;
		this.dice5 = d5;
		this.dice6 = d6;
		this.redGoose = r;
		this.blueGoose = b;
		this.greenGoose = g;
		this.yellowGoose = y;
		this.coordinateMap = cmap;
	}

	public Coordinate getCoordinate(int box) {
		_tmp = new Coordinate(coordinateMap[box - 1][0],
				coordinateMap[box - 1][1]);
		return _tmp;
	}

	/**
	 * @return the dice1
	 */
	public String getDice1() {
		return dice1;
	}

	/**
	 * @return the dice2
	 */
	public String getDice2() {
		return dice2;
	}

	/**
	 * @return the dice3
	 */
	public String getDice3() {
		return dice3;
	}

	/**
	 * @return the dice4
	 */
	public String getDice4() {
		return dice4;
	}

	/**
	 * @return the dice5
	 */
	public String getDice5() {
		return dice5;
	}

	/**
	 * @return the dice6
	 */
	public String getDice6() {
		return dice6;
	}

	/**
	 * @return the redGoose
	 */
	public String getRedGoose() {
		return redGoose;
	}

	/**
	 * @return the blueGoose
	 */
	public String getBlueGoose() {
		return blueGoose;
	}

	/**
	 * @return the yellowGoose
	 */
	public String getYellowGoose() {
		return yellowGoose;
	}

	/**
	 * @return the greenGoose
	 */
	public String getGreenGoose() {
		return greenGoose;
	}

}
