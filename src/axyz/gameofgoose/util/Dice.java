package axyz.gameofgoose.util;

/**
 * Class that represent a dice.
 * 
 * @author Andrea Moretti
 */
public class Dice {
	private int numFaces;
	private int face;
	private String f1, f2, f3, f4, f5, f6;

	/**
	 * Constructor of the class.
	 * 
	 * @param n number
	 *            of faces
	 */
	public Dice(int n) {
		this.numFaces = n;
	}

	/**
	 * Constructor of the class.
	 * 
	 * @param n
	 *            number of faces
	 * @param f1
	 *            the path of the image of the face 1 of the dices
	 * @param f2
	 *            the path of the image of the face 2 of the dices
	 * @param f3
	 *            the path of the image of the face 3 of the dices
	 * @param f4
	 *            the path of the image of the face 4 of the dices
	 * @param f5
	 *            the path of the image of the face 5 of the dices
	 * @param f6
	 *            the path of the image of the face 6 of the dices
	 */
	public Dice(int n, String f1, String f2, String f3, String f4, String f5,
			String f6) {
		this.numFaces = n;
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
		this.f4 = f4;
		this.f5 = f5;
		this.f6 = f6;
	}

	/**
	 * Rolls the dice and set the face to a random one.
	 * 
	 * @return the number obtained
	 */
	public int roll() {
		this.face = (int) (1 + (Math.round(Math.random() * (this.numFaces - 1))));
		return this.face;
	}

	/**
	 * @return the face
	 */
	public int getFace() {
		return face;
	}

	/**
	 * @return the path of the image of the actual face of the dice
	 */
	public String getFaceImg() {
		switch (this.face) {
		case 1:
			return this.f1;
		case 2:
			return this.f2;
		case 3:
			return this.f3;
		case 4:
			return this.f4;
		case 5:
			return this.f5;
		case 6:
			return this.f6;
		default:
			return this.f1;
		}
	}
}
