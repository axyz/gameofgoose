package axyz.gameofgoose.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * GUI component that represent the GameTable for the game of the goose.
 * 
 * @author Andrea Moretti
 */
public class GOGGameTableLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the class.
	 * 
	 * @param img
	 *            the path of the background image
	 */
	public GOGGameTableLabel(String img) {
		super(new ImageIcon(ClassLoader.getSystemResource(img)));
	}
}
