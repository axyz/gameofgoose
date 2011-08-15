package axyz.gameofgoose.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * GUI component that represent a game of the goose player.
 * 
 * @author Andrea Moretti
 */
public class GOGPlayerLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the class.
	 * 
	 * @param img
	 *            the path of the image of the avatar of the player
	 */
	public GOGPlayerLabel(String img) {
		super(new ImageIcon(ClassLoader.getSystemResource(img)));
	}

}
