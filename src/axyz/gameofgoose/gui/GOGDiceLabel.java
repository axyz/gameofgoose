package axyz.gameofgoose.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * GUI component that represent a dice.
 * 
 * @author Andrea Moretti
 */
public class GOGDiceLabel extends JLabel {

	private static final long serialVersionUID = 1L;
	private final ImageIcon f1, f2, f3, f4, f5, f6;

	/**
	 * Constructor of the class.
	 * 
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
	 */
	public GOGDiceLabel(String d1, String d2, String d3, String d4, String d5,
			String d6) {
		super();
		this.f1 = new ImageIcon(ClassLoader.getSystemResource(d1));
		this.f2 = new ImageIcon(ClassLoader.getSystemResource(d2));
		this.f3 = new ImageIcon(ClassLoader.getSystemResource(d3));
		this.f4 = new ImageIcon(ClassLoader.getSystemResource(d4));
		this.f5 = new ImageIcon(ClassLoader.getSystemResource(d5));
		this.f6 = new ImageIcon(ClassLoader.getSystemResource(d6));
	}

	/**
	 * Set the actual face of the dice.
	 * 
	 * @param f
	 *            the face to set
	 */
	public void setFace(int f) {
		switch (f) {
		case 1:
			this.setIcon(f1);
			break;
		case 2:
			this.setIcon(f2);
			break;
		case 3:
			this.setIcon(f3);
			break;
		case 4:
			this.setIcon(f4);
			break;
		case 5:
			this.setIcon(f5);
			break;
		case 6:
			this.setIcon(f6);
			break;
		}
	}

}
